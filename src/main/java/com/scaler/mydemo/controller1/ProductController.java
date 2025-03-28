package com.scaler.mydemo.controller1;

import com.scaler.mydemo.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {
  //  @RequestMapping(value="/product",method= RequestMethod.POST)
    @PostMapping("/product")
    public void CreateProduct(Product product)
    {

    }
    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable("id") long id)
    {
return null;
    }
    public void updateProduct (Product product)
    {

    }
    public void deleteProduct(long id)
    {

    }
}
