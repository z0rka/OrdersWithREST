package com.example.orderswithrest;

import com.example.orderswithrest.model.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class OrdersWithRestApplication {

  private final OrderRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(OrdersWithRestApplication.class, args);
  }
}
