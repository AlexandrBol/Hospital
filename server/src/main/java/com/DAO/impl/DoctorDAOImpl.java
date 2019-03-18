package com.DAO.impl;

import com.DAO.api.DoctorDAO;

import com.mapper.DoctorMapper;
import com.model.Counter;
import com.model.Doctor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.DAO.impl.SQLs.*;



@Component
public class DoctorDAOImpl extends AbstractDAO implements DoctorDAO {
    private String classType = "doctor";
    private int from = 0;  // Start point for Requests with lot of products
    private final int STEP = 20;  // How much products will be returned from one request
    private Counter counter = Counter.UNDEFINED;
    private String searchString = "";  //Using to check if searching request will change

    @Override
    public List<Doctor> getAll() {
        String sql = String.format(SELECT_ALL, classType);
        List<Doctor> bikes = getJdbcTemplate().query(sql, new DoctorMapper());
        return bikes;
    }

    @Override
    public Doctor getById(Integer id) {
        return null;
    }

    @Override
    public List<Doctor> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean update(Doctor doctor, String id) {
        return false;
    }

    @Override
    public boolean insert(Doctor doctor) {
        return false;
    }

    @Override
    public List<Doctor> getTopFive() {
        return null;
    }

    @Override
    public List<Doctor> productSearch(String searchRequest) {
        return null;
    }
}
