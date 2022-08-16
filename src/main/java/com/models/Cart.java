package com.models;

import com.models.products.Product;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(insertable = false, updatable = false, nullable = false)
    private String id;
    @OneToOne
    @JoinColumn(name = "user_username")
    private User user;
    @OneToMany
    private Set<Product> productSet;

    public Cart() {}

    public Cart(User user) {
        this.user = user;
        this.productSet = new HashSet<>();
    }

    public User getUser() { return user; }

    public void addProduct(Product product) { productSet.add(product); }
    public void removeProduct(Product product) { productSet.remove(product); }

}
