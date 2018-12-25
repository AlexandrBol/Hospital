package com.model;

import java.util.Date;


public class Doctor {
    private long doctor_id;
    private String name;
    private String surname;
    private String patronymic;


    public Doctor() {
    }

    public Doctor(long doctor_id, String name, String surname, String patronymic, Date DOB,
                  int phone, int work_phone, long spec_id, Date employed, Date fired, long adress_id,
                  long scheduler_id, long room_id, long hospital_id) {
        this.doctor_id = doctor_id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.DOB = DOB;
        this.phone = phone;
        this.work_phone = work_phone;
        this.spec_id = spec_id;
        this.employed = employed;
        this.fired = fired;
        this.adress_id = adress_id;
        this.scheduler_id = scheduler_id;
        this.room_id = room_id;
        this.hospital_id = hospital_id;
    }

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

    public long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(long doctor_id) {
        this.doctor_id = doctor_id;
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

    public int getWork_phone() {
        return work_phone;
    }

    public void setWork_phone(int work_phone) {
        this.work_phone = work_phone;
    }

    public long getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(long spec_id) {
        this.spec_id = spec_id;
    }

    public Date getEmployed() {
        return employed;
    }

    public void setEmployed(Date employed) {
        this.employed = employed;
    }

    public Date getFired() {
        return fired;
    }

    public void setFired(Date fired) {
        this.fired = fired;
    }

    public long getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(long adress_id) {
        this.adress_id = adress_id;
    }

    public long getScheduler_id() {
        return scheduler_id;
    }

    public void setScheduler_id(long scheduler_id) {
        this.scheduler_id = scheduler_id;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public long getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(long hospital_id) {
        this.hospital_id = hospital_id;
    }
}
