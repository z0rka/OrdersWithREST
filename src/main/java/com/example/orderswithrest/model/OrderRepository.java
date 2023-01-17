package com.example.orderswithrest.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023
 */

@Repository
@Getter
@NoArgsConstructor
public class OrderRepository {

  private final List<Order> orderList = new ArrayList<>();

  public Order getById(int id) {
    return orderList.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
  }
}
