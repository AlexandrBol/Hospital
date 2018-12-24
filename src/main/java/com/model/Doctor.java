package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Doctor {
    private long doctor_id;
    private String name;
    private String surname;
    private String patronymic;
    private Date DOB;
    private int phone;
    private int work_phone;
    private long spec_id;
    private Date employed;
    private Date fired;
    private long adress_id;
    private long scheduler_id;
    private long room_id;
    private long hospital_id;
}
