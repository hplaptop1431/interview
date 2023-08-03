package com.product.controller;

import com.product.entity.Product;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    //http://localhost:8080/api/products

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long id){
        Product product=productService.getProductById(id);
        if(product==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @PostMapping("/cart")
    public ResponseEntity<String> addToCart(@RequestBody Product product){
        Product savedToCart = productService.addToCart(product);
        return new ResponseEntity<>( "Product added to cart successfully", HttpStatus.CREATED);
    }


}
