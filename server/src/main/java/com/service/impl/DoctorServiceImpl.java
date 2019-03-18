package com.service.impl;

import com.DAO.impl.DoctorDAOImpl;
import com.model.Doctor;
import com.service.api.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorDAOImpl doctorDAO;

    @Override
    public List<Doctor> getAll() {
        return doctorDAO.getAll();
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
    public List<Doctor> productSearch(String expression) {
        return null;
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
    public Doctor getByName(String name) {
        Doctor doctor = new Doctor();
        doctor.setName("xxx");
        return doctor;
    }
}
