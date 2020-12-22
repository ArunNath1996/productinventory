package com.product.productInventory.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewEntity {
    private String pros;
    private String cons;
}
