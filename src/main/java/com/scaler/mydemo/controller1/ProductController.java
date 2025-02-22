package com.scaler.mydemo.controller1;

import com.scaler.mydemo.models.product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
  //  @RequestMapping(value="/product",method= RequestMethod.POST)
    @PostMapping("/product")
    public void CreateProduct(product product)
    {

    }
    public product getProduct(long id)
    {
return null;
    }
    public void updateProduct (product product)
    {

    }
    public void deleteProduct(long id)
    {

    }
}
