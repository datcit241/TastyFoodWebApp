package com.data.repositories;

import com.models.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends RepositoryImpl<Order, String>{
}
