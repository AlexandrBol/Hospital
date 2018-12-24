package com.controllers;

import com.model.Doctor;
import com.service.impl.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class DoctorController {


    @Autowired
    DoctorServiceImpl doctorService;

    @RequestMapping("/dcotor/getAll")
    public List<Doctor> getAllProducts() {
        return doctorService.getAll();
    }

}
