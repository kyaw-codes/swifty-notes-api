package com.monkey.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class BaseServiceImpl<E, R extends JpaRepository> implements BaseService<E> {

    private final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E createEntity(E e) {
        return (E) repository.save(e);
    }

    @Override
    public void deleteEntity(E e) {
        repository.delete(e);
    }

    @Override
    public E findById(Long id) {
        return (E) (repository.findById(id).orElseThrow());
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }
}
