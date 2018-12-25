package com.model;

public class Hospital {
    private long hospital_id;
    private long number_of_doctors;
    private long number_of_nurses;
    private long number_of_patients;
    private long number_of_rooms;
    private long adress_id;

    public Hospital() {
    }

    public Hospital(long hospital_id, long number_of_doctors,
                    long number_of_nurses, long number_of_patients, long number_of_rooms, long adress_id) {
        this.hospital_id = hospital_id;
        this.number_of_doctors = number_of_doctors;
        this.number_of_nurses = number_of_nurses;
        this.number_of_patients = number_of_patients;
        this.number_of_rooms = number_of_rooms;
        this.adress_id = adress_id;
    }

    public long getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(long hospital_id) {
        this.hospital_id = hospital_id;
    }

    public long getNumber_of_doctors() {
        return number_of_doctors;
    }

    public void setNumber_of_doctors(long number_of_doctors) {
        this.number_of_doctors = number_of_doctors;
    }

    public long getNumber_of_nurses() {
        return number_of_nurses;
    }

    public void setNumber_of_nurses(long number_of_nurses) {
        this.number_of_nurses = number_of_nurses;
    }

    public long getNumber_of_patients() {
        return number_of_patients;
    }

    public void setNumber_of_patients(long number_of_patients) {
        this.number_of_patients = number_of_patients;
    }

    public long getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(long number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }

    public long getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(long adress_id) {
        this.adress_id = adress_id;
    }
}
