package com.model;


public class Adress {
    private long adress_id;
    private String region;
    private String locality;
    private String street;
    private String house;
    private String appartent;

    public Adress(long adress_id, String region, String locality, String street, String house, String appartent) {
        this.adress_id = adress_id;
        this.region = region;
        this.locality = locality;
        this.street = street;
        this.house = house;
        this.appartent = appartent;
    }

    public Adress(long adress_id, String region, String locality, String street, String house) {
        this.adress_id = adress_id;
        this.region = region;
        this.locality = locality;
        this.street = street;
        this.house = house;
    }

    public Adress() {
    }

    public long getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(long adress_id) {
        this.adress_id = adress_id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAppartent() {
        return appartent;
    }

    public void setAppartent(String appartent) {
        this.appartent = appartent;
    }
}
