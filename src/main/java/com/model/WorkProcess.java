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

public class WorkProcess {
    private long reception_id;
    private long doctor_id;
    private long patient_id;
    private Date time_start;
    private Date time_end;
    private boolean free;
    private int approved;
}
