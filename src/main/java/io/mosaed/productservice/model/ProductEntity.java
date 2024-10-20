package io.mosaed.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author MOSAED ALOTAIBI
 */

@Document(value = "product")
public class ProductEntity {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    private ProductEntity(ProductEntityBuilder productEntityBuilder) {
        this.name = productEntityBuilder.name;
        this.description = productEntityBuilder.description;
        this.price = productEntityBuilder.price;
    }

    public static class ProductEntityBuilder {
        private String name;
        private String description;
        private BigDecimal price;

        public ProductEntityBuilder() {}

        public ProductEntityBuilder name(String name) {
            this.name = name;

            return this;
        }

        public ProductEntityBuilder description(String description) {
            this.description = description;

            return this;
        }

        public ProductEntityBuilder price(BigDecimal price) {
            this.price = price;

            return this;
        }

        public ProductEntity build() {
            return new ProductEntity(this);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
