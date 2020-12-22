package com.product.productInventory.mapper;

import com.product.productInventory.entity.*;
import com.product.productInventory.model.*;
import org.elasticsearch.client.license.LicensesStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductMapper {

    public ProductsEntity mapProduct(Products products) {
        ProductsEntity.builder()
                .id(products.getId())
                .postedDate(products.getPostedDate())
                .bookedDates(mapBookedDates(products.getBookedDates()))
                .userEntityDetails(mapUser(products.getUserDetails()))
                .detailsEntity(mapDetails(products.getDetails()))
                .customerReviewEntity(mapReview(products.getCustomerReview()))
                .locationEntity(mapLocation(products.getLocation()))
                .build();

        return null;
    }
    private  List<BookedDatesEntity> mapBookedDates(List<BookedDates> bookedDates)
    {
        return bookedDates.stream().map(bookedDates1 -> BookedDatesEntity.builder()
        .from(bookedDates1.getFrom())
        .to(bookedDates1.getTo())
        .build()).collect(Collectors.toList());
    }

    private UserEntity mapUser(User user)
    {
        return UserEntity.builder()
                .userId(user.getUserId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

    private DetailsEntity mapDetails(Details details)
    {
        return DetailsEntity.builder()
                .brand(details.getBrand())
                .color(details.getColor())
                .categories(details.getCategories())
                .extraDetails(details.getExtraDetails())
                .cost(details.getCost())
                .height(details.getHeight())
                .imageUrls(details.getImageUrls())
                .name(details.getName())
                .weight(details.getWeight())
                .build();
    }

    private ReviewEntity mapReview(Review review)
    {
        return ReviewEntity.builder()
                .cons(review.getCons())
                .pros(review.getPros())
                .build();
    }

    private LocationEntity mapLocation(Location location)
    {
        return LocationEntity.builder()
                .addressLane1(location.getAddressLane1())
                .addressLane2(location.getAddressLane2())
                .district(location.getDistrict())
                .houseNumber(location.getHouseNumber())
                .landMark(location.getLandMark())
                .postalCode(location.getPostalCode())
                .state(location.getState())
                .build();
    }

}
