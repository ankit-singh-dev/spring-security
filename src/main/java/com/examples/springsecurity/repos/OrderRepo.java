package com.examples.springsecurity.repos;

import com.examples.springsecurity.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,String> {
}
