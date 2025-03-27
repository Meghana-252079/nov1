package com.scaler.mydemo.service;

import com.scaler.mydemo.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProduct implements ProductService{

    @Override
    public Product getSingleProduct(long id) {
        System.out.println("we are in single product method");
        return null;
    }
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProduct(Product Product) {
        return null;
    }
}
