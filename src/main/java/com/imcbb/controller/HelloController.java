package com.imcbb.controller;

import com.imcbb.bean.jedis.Order;
import com.imcbb.bean.jedis.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author kevin
 */
@RestController
public class HelloController {

    @Autowired
    OrderRepository orderRepo;

    @RequestMapping("/hello")
    public String hello(){

        orderRepo.save(new Order("110","order1","kevin", LocalDateTime.now()));

        Order order2 =  orderRepo.findById("110").get();
        System.out.println(order2.orderTime);
        System.out.println(order2.name);
        return "hello";
    }
}
