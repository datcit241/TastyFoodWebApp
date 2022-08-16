package com.models.products;

import com.enums.ProductStatus;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(insertable = false, updatable = false, nullable = false)
    private String id;
    private String name;
    private double price;
    private double discount;
    private ProductStatus status;
    @OneToMany
    private Set<ProductCategory> categorySet;

    public Product() {}

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.discount = 0d;
        this.status = ProductStatus.Available;
        this.categorySet = new HashSet<>();
    }

    public String getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public void addCategory(ProductCategory category) { categorySet.add(category); }
    public void removeCategory(ProductCategory category) { categorySet.remove(category); }

}
