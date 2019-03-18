package com.model;

public class Speciality {
    private long spec_id;
    private String spec_name;
    private String spec_type;

    public Speciality() {
    }

    public Speciality(long spec_id, String spec_name, String spec_type) {
        this.spec_id = spec_id;
        this.spec_name = spec_name;
        this.spec_type = spec_type;
    }

    public long getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(long spec_id) {
        this.spec_id = spec_id;
    }

    public String getSpec_name() {
        return spec_name;
    }

    public void setSpec_name(String spec_name) {
        this.spec_name = spec_name;
    }

    public String getSpec_type() {
        return spec_type;
    }

    public void setSpec_type(String spec_type) {
        this.spec_type = spec_type;
    }
}
