package com.techie.microservices.product_services.controller;

import com.techie.microservices.product_services.Service.ProductService;
import com.techie.microservices.product_services.dto.ProductRequest;
import com.techie.microservices.product_services.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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


    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct() {

        return productService.fetchAllProduct();
    }
}
