package com.example.demo.models;

import lombok.Getter;

import java.util.List;

public class Product {
    public int id;
    public String title;
    public String description;
    public  int price;
    public double discountPercentage;
    public double rating;
    public int stock;
    public String brand;
    public String category;
    public String thumbnail;
    public List<String> images;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public List<String> getImages() {
        return images;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product(int id, String title, String description, int price, double discountPercentage, double rating, int stock, String brand, String category, String thumbnail, List<String> images){
        setId(id);
        setTitle(title);
        setDescription(description);
        setPrice(price);
        setDiscountPercentage(discountPercentage);
        setRating(rating);
        setStock(stock);
        setBrand(brand);
        setCategory(category);
        setThumbnail(thumbnail);
        setImages(images);
    }
}
