package com.data.repositories;

import com.models.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends RepositoryImpl<User, String> {}
