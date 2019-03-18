package com.DAO.api;

import com.model.Doctor;

import java.util.List;


public interface DoctorDAO extends DAO<Doctor> {

    boolean update(Doctor doctor, String id);

    boolean insert(Doctor doctor);

    List<Doctor> getTopFive();

    List<Doctor> productSearch(String searchRequest);
}
