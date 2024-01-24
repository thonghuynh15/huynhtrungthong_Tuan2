package com.demo.huynhtrungthong_product.reponsity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.huynhtrungthong_product.entity.Product;

public interface ProductReponsity extends JpaRepository<Product,Integer> {
}
