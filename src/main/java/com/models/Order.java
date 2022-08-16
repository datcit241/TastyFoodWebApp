package com.models;

import com.enums.OrderStatus;
import com.models.products.Product;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
public class Order {
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
    private OrderStatus status;

    public Order() {}

    public Order(User user, Set<Product> productSet) {
        this.user = user;
        this.productSet = productSet;
        this.status = OrderStatus.Pending;
    }

    public String getId() { return id; }

    public User getUser() { return user; }

    public Set<Product> getProductSet() { return productSet; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }

}
