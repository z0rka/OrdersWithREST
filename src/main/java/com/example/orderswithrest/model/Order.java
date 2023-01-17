package com.example.orderswithrest.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023 Order with list of products , creation date ,
 * summary cost and id
 */

@Data
public class Order {

  private long id;
  private final LocalDate date = LocalDate.now();
  private float cost = 0;
  private final List<Product> productList = new ArrayList<>();
}
