package io.mosaed.productservice.external.db;

import io.mosaed.productservice.model.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author MOSAED ALOTAIBI
 */
public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
