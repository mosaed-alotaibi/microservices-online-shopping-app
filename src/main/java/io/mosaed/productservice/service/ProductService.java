package io.mosaed.productservice.service;

import io.mosaed.productservice.dto.ProductRequest;
import io.mosaed.productservice.model.Product;
import io.mosaed.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author MOSAED ALOTAIBI
 * @created 3/3/2023 at 23:22
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice()).build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getName());
    }
}
