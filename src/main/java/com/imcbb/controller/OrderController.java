package com.imcbb.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.imcbb.bean.jedis.Order;
import com.imcbb.bean.jedis.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author kevin
 */
@RestController
public class OrderController {


    @Autowired
    OrderRepository orderRepo;

    @RequestMapping("/placeOrder")
    public Order placeOrder(String orderId) {

        Order order = orderRepo.save(new Order(orderId, "新的订单", "kevin", LocalDateTime.now()));
        System.out.println("订单保存成功：" + order);
        orderRepo.findAll().forEach(System.out::println);
        return order;
    }

    @RequestMapping("/findOrder")
    public Order findOrder(String orderId) {

        Optional<Order> order = orderRepo.findById(orderId);
        System.out.println("查到订单：" + order);
        return order.get();
    }


}
