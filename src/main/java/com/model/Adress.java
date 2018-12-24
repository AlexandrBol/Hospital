package com.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Adress {
    private long adress_id;
    private String region;
    private String locality;
    private String street;
    private String house;
    private String appartent;

}
