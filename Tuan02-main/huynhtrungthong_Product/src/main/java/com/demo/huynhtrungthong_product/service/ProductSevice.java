package com.demo.huynhtrungthong_product.service;

import java.util.List;

import com.demo.huynhtrungthong_product.entity.Product;

public interface ProductSevice {
    public List<Product> getAllProduct();
    public void addProduct(Product product);

}
