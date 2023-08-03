package com.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double price;

}

//        1) get list of products
//        2) view product details
//        3) add product to cart
//        4) fetch payment methods (Card, UPI, Online banking)
//        5) pay using multiple payment options.
