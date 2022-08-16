package com.services;

import com.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.function.*;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

}
