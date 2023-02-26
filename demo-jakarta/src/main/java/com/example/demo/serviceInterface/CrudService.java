package com.example.demo.serviceInterface;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

/**
* Generated by Springboot-3layer-Generator at Feb 26, 2023, 4:20:30 PM
*/
public interface CrudService<E, P> {

    E create(E entity);

    E update(E entity);

    Page<E> find(E entity, Pageable pageable);

    Optional<E> getOne(P primaryKey);

    void delete(P primaryKey);

}