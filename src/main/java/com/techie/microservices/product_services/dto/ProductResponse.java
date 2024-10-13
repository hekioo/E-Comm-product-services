package com.techie.microservices.product_services.dto;

import java.math.BigDecimal;

public record ProductResponse(Integer id, String name, String description, BigDecimal price) {
}
