package com.example.demo.models;

import java.util.List;

public class Message
{
    public List<Product> products;
    public int total;
    public int skip;
    public int limit;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public int getSkip() {
        return skip;
    }

    public int getTotal() {
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Message(List<Product> products){
        setProducts(products);
        setTotal(products.size());
        setLimit(products.size());
        setSkip(0);
    }
}
