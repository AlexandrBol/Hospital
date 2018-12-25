package com.service.api;


import com.model.Doctor;

import java.util.List;

public interface DoctorService extends Service<Doctor> {

    List<Doctor> productSearch(String expression);

    boolean update(Doctor doctor, String id);

    boolean insert(Doctor doctor);

}
