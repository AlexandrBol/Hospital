package com.controllers;

import com.model.Doctor;
import com.service.impl.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class DoctorController {


    @Autowired
    DoctorServiceImpl doctorService;

    @RequestMapping(value = "/dcotor/getAll", produces = "application/json", method = RequestMethod.GET)
    public List<Doctor> getAllProducts() {
        List<Doctor> serviceAll = doctorService.getAll();
        System.out.println("xxx" + serviceAll);
        return serviceAll;
    }

    @RequestMapping(value = "/doctor/{name}", produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public Doctor getDoctor(@PathVariable String name) {
        Doctor doctor = doctorService.getByName(name);
        System.out.println("doctor" + doctor.getName());
        return doctor;
    }

}
