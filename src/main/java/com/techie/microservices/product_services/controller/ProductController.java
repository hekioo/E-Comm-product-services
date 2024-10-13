package com.techie.microservices.product_services.controller;

import com.techie.microservices.product_services.Service.ProductService;
import com.techie.microservices.product_services.dto.ProductRequest;
import com.techie.microservices.product_services.dto.ProductResponse;
import com.techie.microservices.product_services.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse addProduct(@RequestBody ProductRequest product) {

        return productService.createProduct(product);
    }


    @GetMapping("/getProduct")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct() {

        return productService.fetchAllProduct();
    }
}
