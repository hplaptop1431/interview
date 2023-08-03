package com.product.serviceImpl;

import com.product.entity.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        Optional<Product> byId = productRepository.findById(id);
        Product product= byId.get();
        return product;
    }

    @Override
    public Product addToCart(Product product) {
        return productRepository.save(product);
    }
}
