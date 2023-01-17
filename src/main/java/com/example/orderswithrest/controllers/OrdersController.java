package com.example.orderswithrest.controllers;

import com.example.orderswithrest.model.Order;
import com.example.orderswithrest.model.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kostiantyn Kvartyrmeister 09.01.2023 Rest controller to work with repository of orders
 */

//Links for the test
// localhost:8080/add/order
// localhost:8080/add/order/1?productName=Orbit
// localhost:8080/find/order/1
// localhost:8080/find/orders
@RestController
@RequiredArgsConstructor
@Slf4j
public class OrdersController {

  private final OrderRepository repository;

  @Value("${my.added.default.info}")
  private String generalAddInfo;

  /**
   * Showing order with exact id
   */
  @GetMapping("/find/order/{id}")
  public Order getOrder(@PathVariable int id) {
    return repository.getById(id);
  }

  /**
   * Showing all orders
   */
  @GetMapping("/find/orders")
  public List<Order> getOrders() {

    return repository.getOrderList();
  }


  /**
   * Adding product to the order
   */
  @PostMapping("/add/order/{id}")
  public String addOrder(@PathVariable int id, @RequestParam String productName) {
    repository.addProduct(id, productName);

    return generalAddInfo;
  }

  /**
   * Adding just empty order
   */
  @PostMapping("/add/order")
  public String addOrder() {
    repository.add();
    return generalAddInfo;
  }
}
