package com.techie.microservices.product_services.Service;

import com.techie.microservices.product_services.dto.ProductRequest;
import com.techie.microservices.product_services.dto.ProductResponse;
import com.techie.microservices.product_services.model.Product;
import com.techie.microservices.product_services.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepo.save(product);
        log.info("Product create successfully");

        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice());


    }


    public List<ProductResponse> fetchAllProduct() {

        log.info("Product list fetched successfully");
        return productRepo.findAll().stream().map(product -> new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice()))
                .toList();

    }
}
