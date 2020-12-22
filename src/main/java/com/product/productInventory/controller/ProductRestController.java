package com.product.productInventory.controller;

import com.product.productInventory.entity.ProductsEntity;
import com.product.productInventory.model.Products;
import com.product.productInventory.repository.ProductRepository;
import com.product.productInventory.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/productinventory")
public class ProductRestController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductsService productsService;

    @PostMapping("/product")
    public ProductsEntity addProduct(@RequestBody Products products)
    {
        return productsService.addProduct(products);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable String id)
    {
        productsService.deleteProduct(id);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Products products)
    {
        productsService.addProduct(products);
    }

    @GetMapping("product/{id}")
    public ProductsEntity getProduct(@PathVariable String id)
    {
        return productsService.getProduct(id);
    }
}
