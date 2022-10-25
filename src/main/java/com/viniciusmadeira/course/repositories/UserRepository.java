package com.viniciusmadeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusmadeira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
