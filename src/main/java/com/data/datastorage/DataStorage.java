package com.data.datastorage;

import com.data.repositories.RepositoryImpl;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DataStorage {
}
