package com.example.orderswithrest.model;

import lombok.Data;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023
 */
@Data
public class Product {

  private final long id;
  private final String name;
  private final float cost;
}
