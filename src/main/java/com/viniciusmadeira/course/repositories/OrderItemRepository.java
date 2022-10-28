package com.viniciusmadeira.course.repositories;

import com.viniciusmadeira.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
