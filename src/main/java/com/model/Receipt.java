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

public class Receipt {
    private long receipt_id;
    private String testimony;
    private String diagnosis;
    private String treatment;
    private Date date;
    private long doctor_id;
}
