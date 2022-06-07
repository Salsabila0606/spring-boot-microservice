package com.javatechie.ps.api.common;

import com.javatechie.ps.api.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputProductResponse {
    private Product product;
}
