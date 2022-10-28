package com.viniciusmadeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusmadeira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
