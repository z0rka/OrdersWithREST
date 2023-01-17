package com.example.orderswithrest.configuration;

import com.example.orderswithrest.model.Product;
import com.example.orderswithrest.model.ProductList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kostiantyn Kvartyrmeister 05.01.2023
 */

@Configuration
public class ProductConfiguration {

  @Bean
  public Product orbitProduct() {
    return new Product(1, "Orbit", 20L);
  }

  @Bean
  public Product cheeseProduct() {
    return new Product(2, "Cheese", 42L);
  }

  @Bean
  public Product phoneProduct() {
    return new Product(3, "Phone", 8000L);
  }

  @Bean
  public Product powerBankProduct() {
    return new Product(4, "Power Bank", 3000L);
  }

  @Bean
  public Product waterProduct() {
    return new Product(5, "Water", 15L);
  }

  @Bean
  public ProductList products() {
    List<Product> productList = new ArrayList<>();

    productList.add(orbitProduct());
    productList.add(cheeseProduct());
    productList.add(phoneProduct());
    productList.add(powerBankProduct());
    productList.add(waterProduct());

    return new ProductList(productList);
  }
}
