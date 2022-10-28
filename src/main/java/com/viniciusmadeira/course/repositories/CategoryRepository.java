package com.viniciusmadeira.course.repositories;

import com.viniciusmadeira.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
