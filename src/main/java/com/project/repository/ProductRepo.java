package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
