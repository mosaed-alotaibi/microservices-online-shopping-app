package io.mosaed.productservice.service;

import io.mosaed.productservice.presentation.dto.ProductRequest;
import io.mosaed.productservice.presentation.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
