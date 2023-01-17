package com.example.orderswithrest.controllers;

import com.example.orderswithrest.model.Order;
import com.example.orderswithrest.service.OrdersService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kostiantyn Kvartyrmeister 09.01.2023
 */

@RestController
@RequiredArgsConstructor
public class OrdersController {

  private final OrdersService service;

  @Value("${my.added.default.info}")
  private String generalAddInfo;

  @GetMapping("find/order")
  public Order getOrder(@RequestParam int id) {
    return service.orderRepository.getById(id);
  }

  @GetMapping("find/orders")
  public List<Order> getOrders() {
    return service.orderRepository.getOrderList();
  }

  @PostMapping("add/order{id}")
  public String addOrder(@RequestBody Order order) {
    service.addOrder(order);

    return generalAddInfo + order.getId();
  }
}
