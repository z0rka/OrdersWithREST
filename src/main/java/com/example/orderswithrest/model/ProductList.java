package com.example.orderswithrest.model;

import java.util.List;
import lombok.Data;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023
 */
@Data
public class ProductList {

  private final List<Product> productList;
}
