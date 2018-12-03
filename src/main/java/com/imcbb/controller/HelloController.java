package com.imcbb.controller;

import com.imcbb.bean.jedis.Order;
import com.imcbb.bean.jedis.OrderRepository;
import com.imcbb.factory.MerchantFactory;
import com.imcbb.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author kevin
 */
@RestController
public class HelloController {

    @Autowired
    MerchantFactory merchantFactory;

    @Autowired
    OrderRepository orderRepo;

    @RequestMapping("/hello")
    public String hello() {

        orderRepo.save(new Order("110", "order1", "kevin", LocalDateTime.now()));

        Order order2 = orderRepo.findById("110").get();
        System.out.println(order2.orderTime);
        System.out.println(order2.name);
        return "hello";
    }

    @RequestMapping("/service")
    public String service() {
        FundService fundService = merchantFactory.getFundServiceById("003");
        return fundService.toString();
    }


}
