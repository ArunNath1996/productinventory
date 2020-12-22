package com.product.productInventory.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationEntity {
    private String houseNumber;
    private String addressLane1;
    private String addressLane2;
    private String district;
    private String state;
    private String postalCode;
    private String landMark;
}
