package com.product.productInventory.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Review {
    private String pros;
    private String cons;
}
