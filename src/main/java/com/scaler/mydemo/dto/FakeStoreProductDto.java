package com.scaler.mydemo.dto;

import com.scaler.mydemo.models.Category;
import com.scaler.mydemo.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String desc;
    private String category;
    private String imageurl;
    public Product getProduct(){
        Product product=new Product();
        product.setTitle(title);
        product.setPrice(price);
        product.setDesc(desc);
       product.setImageurl(imageurl);
Category cat=new Category();

cat.getTitle(category);
product.setCategory(cat);
return product;
    }
}
