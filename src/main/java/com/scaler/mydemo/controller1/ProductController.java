package com.scaler.mydemo.controller1;

import com.scaler.mydemo.models.Product;
import com.scaler.mydemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan("com.scaler.mydemo.*")
public class ProductController {
  //  @RequestMapping(value="/product",method= RequestMethod.POST)
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public void CreateProduct(Product product)
    {

    }
   @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") long id)
    {
        productService.getSingleProduct(id);
return null;
    }
    public void updateProduct (Product product)
    {

    }
    public void deleteProduct(long id)
    {

    }
}
