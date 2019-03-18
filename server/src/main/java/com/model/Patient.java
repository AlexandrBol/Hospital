package com.model;

import java.util.Date;


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

    public Patient() {
    }

    public Patient(long patient_id, String name, String surname, String patronymic, Date DOB, int phone, long adress_id, long medical_receipt_id, long hospital_id) {
        this.patient_id = patient_id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.DOB = DOB;
        this.phone = phone;
        this.adress_id = adress_id;
        this.medical_receipt_id = medical_receipt_id;
        this.hospital_id = hospital_id;
    }

    public long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(long patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public long getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(long adress_id) {
        this.adress_id = adress_id;
    }

    public long getMedical_receipt_id() {
        return medical_receipt_id;
    }

    public void setMedical_receipt_id(long medical_receipt_id) {
        this.medical_receipt_id = medical_receipt_id;
    }

    public long getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(long hospital_id) {
        this.hospital_id = hospital_id;
    }
}
