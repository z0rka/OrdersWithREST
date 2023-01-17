package com.example.orderswithrest.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023 Repository of all the orders
 */

@Repository
@Getter
@RequiredArgsConstructor

public class OrderRepository {

  private final List<Order> orderList = new ArrayList<>();

  private final ProductList productList;
  private long orders = 0;

  /**
   * Method to get order by id
   *
   * @param id - id of the order
   */
  public Order getById(int id) {
    return orderList.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
  }

  /**
   * Method to add order
   */
  public void add() {

    Order order = new Order();

    order.setId(orders);
    orderList.add(order);
    orders += 1;
  }

  /**
   * Method to add product by name
   *
   * @param productName - name of the product
   * @param id - id of the order
   */
  public void addProduct(int id, String productName) {
    Product product =
        productList.getProducts().stream()
            .filter(product1 -> product1.getName().equals(productName))
            .findFirst()
            .orElse(null);

    if (product == null || id < 0 || id > orderList.size() - 1) {
      return;
    }

    orderList.get(id).getProductList().add(product);
    orderList.get(id).setCost(orderList.get(id).getCost() + product.getCost());
  }
}
