package com.product.productInventory.repository;

import com.product.productInventory.entity.ProductsEntity;
import com.product.productInventory.model.Products;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<ProductsEntity,String> {
}
