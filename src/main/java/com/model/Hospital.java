package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Hospital {
    private long hospital_id;
    private long number_of_doctors;
    private long number_of_nurses;
    private long number_of_patients;
    private long number_of_rooms;
    private long adress_id;
}
