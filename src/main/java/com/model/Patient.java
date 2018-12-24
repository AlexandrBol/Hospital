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

public class Patient {
    private long patient_id;
    private String name;
    private String surname;
    private String patronymic;
    private Date DOB;
    private int phone;
    private long adress_id;
    private long medical_receipt_id;
    private long hospital_id;
}
