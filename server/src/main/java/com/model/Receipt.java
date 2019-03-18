package com.model;



import java.util.Date;


public class Receipt {
    private long receipt_id;
    private String testimony;
    private String diagnosis;
    private String treatment;
    private Date date;
    private long doctor_id;

    public Receipt() {
    }

    public Receipt(long receipt_id, String testimony, String diagnosis, String treatment, Date date, long doctor_id) {
        this.receipt_id = receipt_id;
        this.testimony = testimony;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
        this.doctor_id = doctor_id;
    }

    public long getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(long receipt_id) {
        this.receipt_id = receipt_id;
    }

    public String getTestimony() {
        return testimony;
    }

    public void setTestimony(String testimony) {
        this.testimony = testimony;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(long doctor_id) {
        this.doctor_id = doctor_id;
    }
}
