package com.product.service;

import com.product.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();


    public Product getProductById(long id);

    public Product addToCart(Product product);

}
