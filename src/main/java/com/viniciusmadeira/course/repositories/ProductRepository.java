package com.viniciusmadeira.course.repositories;

import com.viniciusmadeira.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
