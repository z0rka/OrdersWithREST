package com.example.orderswithrest.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023
 */

@RequiredArgsConstructor
@Getter
public class Order {

  private final long id;
  private final LocalDate date = LocalDate.now();
  private float cost;
  private final List<Product> productList = new ArrayList<>();

  public Product getById(int id) {
    return productList.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
  }

  public void addProduct(String productName) {
    Product product =
        productList.stream()
            .filter(product1 -> product1.getName().equals(productName))
            .findFirst()
            .orElse(null);

    if (product == null) {
      return;
    }

    productList.add(product);
    cost += product.getCost();
  }
}
