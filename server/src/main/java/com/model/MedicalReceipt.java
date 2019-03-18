package com.model;


public class MedicalReceipt {
    private long medical_receipts_id;
    private long receipt_id;
    private String important;

    public MedicalReceipt(long medical_receipts_id, long receipt_id, String important) {
        this.medical_receipts_id = medical_receipts_id;
        this.receipt_id = receipt_id;
        this.important = important;
    }

    public MedicalReceipt() {
    }

    public long getMedical_receipts_id() {
        return medical_receipts_id;
    }

    public void setMedical_receipts_id(long medical_receipts_id) {
        this.medical_receipts_id = medical_receipts_id;
    }

    public long getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(long receipt_id) {
        this.receipt_id = receipt_id;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }
}
