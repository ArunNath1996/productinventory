package com.product.productInventory.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Document(indexName = "productsinventory")
public class ProductsEntity {

    private String id;

    private List<BookedDatesEntity> bookedDates;

    private DetailsEntity detailsEntity;

    private LocationEntity locationEntity;

    private LocalDateTime postedDate;

    private ReviewEntity customerReviewEntity;

    private UserEntity userEntityDetails;

}
