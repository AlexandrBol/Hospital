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

public class Nurse {
    private long nurse_id;
    private String name;
    private String surname;
    private String patronymic;
    private Date DOB;
    private int phone;
    private Date employed;
    private Date fired;
    private long adress_id;
    private long scheduler_id;
    private long room_id;
    private long spec_id;
    private long hospital_id;
}
