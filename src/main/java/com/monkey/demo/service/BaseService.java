package com.monkey.demo.service;

import java.util.List;

public interface BaseService<E> {

    E createEntity(E e);

    void deleteEntity(E e);

    E findById(Long id);

    List<E> findAll();
}
