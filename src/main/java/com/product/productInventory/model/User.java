package com.product.productInventory.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    @JsonProperty(required = true)
    private String userId;
    private String firstName;
    private String lastName;
}
