package com.scaler.mydemo.service;

import com.scaler.mydemo.models.Product;

import java.util.List;

public interface ProductService {
    public Product getSingleProduct(long id) ;

    List<Product> getAllProducts();
    Product getProduct(Product Product);
}
