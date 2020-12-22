package com.product.productInventory.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BookedDates {
    private LocalDateTime from;
    private LocalDateTime to;
}
