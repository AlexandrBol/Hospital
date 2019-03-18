package com.model;



import java.util.Date;


public class Scheduler {
    private long scheduler_id;
    private Date date_start;
    private Date date_end;
    private long type_id;

    public Scheduler() {
    }

    public Scheduler(long scheduler_id, Date date_start, Date date_end, long type_id) {
        this.scheduler_id = scheduler_id;
        this.date_start = date_start;
        this.date_end = date_end;
        this.type_id = type_id;
    }

    public long getScheduler_id() {
        return scheduler_id;
    }

    public void setScheduler_id(long scheduler_id) {
        this.scheduler_id = scheduler_id;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public long getType_id() {
        return type_id;
    }

    public void setType_id(long type_id) {
        this.type_id = type_id;
    }
}
