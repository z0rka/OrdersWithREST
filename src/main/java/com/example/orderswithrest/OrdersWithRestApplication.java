package com.example.orderswithrest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class OrdersWithRestApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrdersWithRestApplication.class, args);
  }
}
