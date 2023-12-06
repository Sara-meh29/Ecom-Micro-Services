package org.sid.orderservice.repository;

import org.sid.orderservice.entities.Order;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public interface OrderRepository extends JpaRepository<Order, Long> {



}
