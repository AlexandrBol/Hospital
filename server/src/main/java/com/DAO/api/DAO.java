package com.DAO.api;


import java.util.List;

public interface DAO<T> {
    //Select all Objects from table
    public List<T> getAll();

    //Select one Object from table using ID
    public T getById(Integer id);

    //Selecting all Objects from table where field value == value
    public List<T> getBy(String fieldName, String value);

    //Deleting Object from table using ID
    public boolean delete(Integer id);
}
