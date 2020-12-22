package com.product.productInventory.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class Details {
    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private double cost;
    private String color;
    @JsonProperty(required = true)
    private String brand;
    private String height;
    private String weight;
    private List<String> imageUrls;
    private List<String> categories;
    private Map<Object,Object> extraDetails;
}
