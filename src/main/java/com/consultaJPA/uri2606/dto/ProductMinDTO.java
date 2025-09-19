package com.consultaJPA.uri2606.dto;

import com.consultaJPA.uri2606.projections.ProductProjection;

public class ProductMinDTO {

    private Long id;
    private String name;
    
    public ProductMinDTO() {
    }

    public ProductMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductMinDTO(ProductProjection projection) {
        id = projection.getId();
        name = projection.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductMinDTO [id=" + id + ", name=" + name + "]";
    }

}
