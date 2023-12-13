package com.project.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.project.entity.Product;


public interface ProductService {

    List<Product> getAllProducts();

    Product insertProductIntoDatabase(Product product);

    Product getProductById(int id );

    List<Product> findProductsWithSorting(String field);

    Page<Product> findProductsWithPagination(int offset, int pageSize);

    Page<Product> findProductsWithPaginationAndSorting(int offset,int pageSize,String field);

    List<Product> sortBasedOnSomeField( String field);

    Page<Product> getProductWithPagination(int offset , int pageSize);

    Page<Product>  getProoductWithPaginationAndSorting(int offset, int pageSize, String field);
}
