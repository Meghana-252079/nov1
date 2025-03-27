package com.scaler.mydemo.models;


public class Product {
    private Long id;
    private String desc;
    private String title;
    private Category category;
    private Double price;
    private String imageurl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private Category category;
    public Product() {
    }
    //chinnu

    public Product(Long id, String desc, String title, Double price, String imageurl, Category category) {
        this.id = id;
        this.desc = desc;
        this.title = title;
        this.price = price;
        this.imageurl = imageurl;
        this.category = category;
    }

}
