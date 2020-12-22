package com.product.productInventory.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Products {

    private String id;

    private List<BookedDates> bookedDates;

    private Details details;

    private Location location;

    private LocalDateTime postedDate;

    private Review customerReview;

    private User userDetails;

}
