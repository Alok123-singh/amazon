package com.example.Amazon.AmazonClone.Repositories;

import com.example.Amazon.AmazonClone.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


}