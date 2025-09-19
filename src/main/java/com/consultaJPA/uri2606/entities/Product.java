package com.consultaJPA.uri2606.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "id_categories")
    private Category category;

    public Product() {
    }

    public Product(Long id, String name, Integer amount, Double price, Category category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + ", category="
                + category + "]";
    }
    
}
