package com.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
import java.util.function.*;

public interface RepositoryImpl<T, ID> extends JpaRepository<T, ID> {
    default T find(Predicate<T> predicate) {
        T t = findAll().stream().filter(predicate).findFirst().orElse(null);
        return t;
    }

    default List<T> get(Predicate<T> predicate, Comparator<T> comparator) {
        List<T> matches;

        if (comparator != null) {
            matches = findAll().stream().filter(predicate).sorted(comparator).toList();
        } else {
            matches = findAll().stream().filter(predicate).toList();
        }

        return matches;
    }
}
