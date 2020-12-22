package com.product.productInventory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntity {
    @JsonProperty(required = true)
    private String userId;
    private String firstName;
    private String lastName;
}
