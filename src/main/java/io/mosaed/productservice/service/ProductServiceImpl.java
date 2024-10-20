package io.mosaed.productservice.service;

import io.mosaed.productservice.external.db.ProductRepository;
import io.mosaed.productservice.model.ProductEntity;
import io.mosaed.productservice.presentation.dto.ProductRequest;
import io.mosaed.productservice.presentation.dto.ProductResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MOSAED ALOTAIBI
 */

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private static final Logger LOGGER = LogManager.getLogger();

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(ProductRequest productRequest) {
        ProductEntity productEntity = new ProductEntity.ProductEntityBuilder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice()).build();

        productRepository.save(productEntity);
        LOGGER.info("Product {} is saved", productEntity.getName());
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();

        return productEntities.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(ProductEntity productEntity) {
        return new ProductResponse.ProductResponseBuilder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .price(productEntity.getPrice())
                .build();
    }
}
