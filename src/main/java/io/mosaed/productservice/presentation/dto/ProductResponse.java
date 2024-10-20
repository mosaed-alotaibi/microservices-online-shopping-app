package io.mosaed.productservice.presentation.dto;

import java.math.BigDecimal;

/**
 * @author MOSAED ALOTAIBI
 */

public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public ProductResponse(ProductResponseBuilder productResponseBuilder) {
        this.id = productResponseBuilder.id;
        this.name = productResponseBuilder.name;
        this.description = productResponseBuilder.description;
        this.price = productResponseBuilder.price;
    }

    public static class ProductResponseBuilder {
        private String id;
        private String name;
        private String description;
        private BigDecimal price;

        public ProductResponseBuilder() {
        }

        public ProductResponseBuilder id(String id) {
            this.id = id;

            return this;
        }

        public ProductResponseBuilder name(String name) {
            this.name = name;

            return this;
        }

        public ProductResponseBuilder description(String description) {
            this.description = description;

            return this;
        }

        public ProductResponseBuilder price(BigDecimal price) {
            this.price = price;

            return this;
        }

        public ProductResponse build() {
            return new ProductResponse(this);
        }
    }

    public String getId() {
        return this.id;
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
