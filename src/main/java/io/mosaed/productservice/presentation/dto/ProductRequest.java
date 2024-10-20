package io.mosaed.productservice.presentation.dto;

import java.math.BigDecimal;

/**
 * @author MOSAED ALOTAIBI
 */

public class ProductRequest {

    private String name;
    private String description;
    private BigDecimal price;

    public ProductRequest(ProductRequestBuilder productRequestBuilder) {
        this.name = productRequestBuilder.name;
        this.description = productRequestBuilder.description;
        this.price = productRequestBuilder.price;
    }

    public static class ProductRequestBuilder {
        private String name;
        private String description;
        private BigDecimal price;

        public ProductRequestBuilder() {}

        public ProductRequestBuilder name(String name) {
            this.name = name;

            return this;
        }

        public ProductRequestBuilder description(String description) {
            this.description = description;

            return this;
        }

        public ProductRequestBuilder price(BigDecimal price) {
            this.price = price;

            return this;
        }

        public ProductRequest build() {
            return new ProductRequest(this);
        }
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
