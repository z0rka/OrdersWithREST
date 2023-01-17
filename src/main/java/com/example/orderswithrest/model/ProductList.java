package com.example.orderswithrest.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023
 * List of products available in the shop
 */
@Data
@AllArgsConstructor
public class ProductList {

  private final List<Product> products;
}
