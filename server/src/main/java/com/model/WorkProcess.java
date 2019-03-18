package com.model;


import java.util.Date;

public class WorkProcess {
    private long reception_id;
    private long doctor_id;
    private long patient_id;
    private Date time_start;
    private Date time_end;
    private boolean free;
    private int approved;

    public WorkProcess() {
    }

    public WorkProcess(long reception_id, long doctor_id, long patient_id,
                       Date time_start, Date time_end, boolean free, int approved) {
        this.reception_id = reception_id;
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
        this.time_start = time_start;
        this.time_end = time_end;
        this.free = free;
        this.approved = approved;
    }

    public long getReception_id() {
        return reception_id;
    }

    public void setReception_id(long reception_id) {
        this.reception_id = reception_id;
    }

    public long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(long patient_id) {
        this.patient_id = patient_id;
    }

    public Date getTime_start() {
        return time_start;
    }

    public void setTime_start(Date time_start) {
        this.time_start = time_start;
    }

    public Date getTime_end() {
        return time_end;
    }

    public void setTime_end(Date time_end) {
        this.time_end = time_end;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }
}
