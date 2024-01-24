package com.demo.huynhtrungthong_product.controller;

import com.demo.huynhtrungthong_product.entity.Product;
import com.demo.huynhtrungthong_product.reponsity.ProductReponsity;
import com.demo.huynhtrungthong_product.service.ProductSevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired
    ProductSevice productSevice;
    @Autowired
    ProductReponsity productReponsity;

    // Get List User
    @GetMapping("/product")
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        products = productSevice.getAllProduct();
        return products;
    }

    // Add User
    @PostMapping("/product")
    public Product addUser(@RequestBody Product product) {
        productSevice.addProduct(product);
        return product;
    }

    // Tim thong tin theo id
    @GetMapping("/product/{id}")
    public Product findByIdProduct(@PathVariable Integer id) {
        Optional<Product> optional =productReponsity.findById(id);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            new RuntimeException("Khong co product theo id nay");
        }

        return product;
    }
}
