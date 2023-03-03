package io.mosaed.productservice.repository;

import io.mosaed.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author MOSAED ALOTAIBI
 * @created 3/3/2023 at 23:16
 */
public interface ProductRepository extends MongoRepository<Product, String> {
}
