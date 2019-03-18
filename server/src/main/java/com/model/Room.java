package com.model;




public class Room {
    private long room_id;
    private long number;
    private String name;
    private String placed;
    private long hospital_id;
    private long work_places;

    public Room() {
    }

    public Room(long room_id, long number, String name, String placed, long hospital_id, long work_places) {
        this.room_id = room_id;
        this.number = number;
        this.name = name;
        this.placed = placed;
        this.hospital_id = hospital_id;
        this.work_places = work_places;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaced() {
        return placed;
    }

    public void setPlaced(String placed) {
        this.placed = placed;
    }

    public long getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(long hospital_id) {
        this.hospital_id = hospital_id;
    }

    public long getWork_places() {
        return work_places;
    }

    public void setWork_places(long work_places) {
        this.work_places = work_places;
    }
}
