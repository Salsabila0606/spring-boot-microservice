package com.javatechie.ps.api.controller;


import com.javatechie.ps.api.common.GetIdProductResponse;
import com.javatechie.ps.api.entity.Product;
import com.javatechie.ps.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/inputProduct")
    public Product inputProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping("/{productId}")
    private GetIdProductResponse findCatalogById(@PathVariable int productId){
        return service.getIdProductResponse(productId);
    }

}
