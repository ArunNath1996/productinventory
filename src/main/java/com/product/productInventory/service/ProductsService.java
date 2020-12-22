package com.product.productInventory.service;

import com.product.productInventory.entity.ProductsEntity;
import com.product.productInventory.mapper.ProductMapper;
import com.product.productInventory.model.Products;
import com.product.productInventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductRepository productRepository;

    public ProductsEntity addProduct(Products products)
    {

        ProductsEntity productsEntity= productMapper.mapProduct(products);
        productRepository.save(productsEntity);
        return productsEntity;
    }

    public void deleteProduct(String productId)
    {
        productRepository.deleteById(productId);
    }

    public ProductsEntity getProduct(String productId)
    {
        Optional<ProductsEntity> productsEntity=productRepository.findById(productId);
        return productsEntity.isPresent() ? productsEntity.get() : null;
    }
}
