package com.example.orderswithrest.service;

import com.example.orderswithrest.model.Order;
import com.example.orderswithrest.model.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023
 */

@RestController
@RequiredArgsConstructor
public class OrdersService {

  public final OrderRepository orderRepository;

  public void addOrder(Order order) {
    orderRepository.getOrderList().add(order);
  }

  public Order getOrderById(int id) {
    return orderRepository.getById(id);
  }

  public List<Order> getOrders() {
    return orderRepository.getOrderList();
  }
}
