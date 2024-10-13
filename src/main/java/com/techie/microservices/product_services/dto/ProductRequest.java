package com.techie.microservices.product_services.dto;

import java.math.BigDecimal;

public record ProductRequest(Integer id, String name, String description, BigDecimal price) { }
