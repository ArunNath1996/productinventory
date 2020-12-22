package com.product.productInventory.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BookedDatesEntity {
    private LocalDateTime from;
    private LocalDateTime to;
}
