package com.service.api;

import java.util.List;

public interface Service<T> {
    List<T> getAll();

    public T getById(Integer id);

    public List<T> getBy(String fieldName, String value);

    public boolean delete(Integer id);
}
