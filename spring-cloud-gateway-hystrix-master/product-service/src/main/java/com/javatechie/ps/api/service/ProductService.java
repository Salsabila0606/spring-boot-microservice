package com.javatechie.ps.api.service;

import com.javatechie.ps.api.common.GetIdProductResponse;
import com.javatechie.ps.api.common.InputProductRequest;
import com.javatechie.ps.api.common.InputProductResponse;
import com.javatechie.ps.api.entity.Product;
import com.javatechie.ps.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public InputProductResponse addProduct(InputProductRequest request){
        Product product = request.getProduct();
        repository.save(product);

        return new InputProductResponse(product);
    }

    public GetIdProductResponse getIdProductResponse(int productId) {
        Optional<Product> oCatalog = repository.findById(productId);
        Product catalogTemp = new Product();
        if(!oCatalog.isEmpty()){
            Product product = oCatalog.get();
            return new GetIdProductResponse(product,"produk tersedia");
        }else{
            return new GetIdProductResponse(catalogTemp,"produk tidak tersedia");
        }
    }
}
