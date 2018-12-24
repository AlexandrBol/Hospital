package com.mapper;

import com.model.Doctor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DoctorMapper implements RowMapper<Doctor> {
    public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Doctor doctor = new Doctor();

        doctor.setDoctor_id(rs.getLong("doctor_id"));
        doctor.setName(rs.getString("name"));
        doctor.setSurname(rs.getString("surname"));
        doctor.setPatronymic(rs.getString("patronymic"));
        doctor.setDOB(rs.getDate("DOB"));
        doctor.setPhone(rs.getInt("phone"));
        doctor.setWork_phone(rs.getInt("work_phone"));
        doctor.setSpec_id(rs.getLong("spec_id"));
        doctor.setEmployed(rs.getDate("employed"));
        doctor.setFired(rs.getDate("fired"));

        doctor.setAdress_id(rs.getLong("adress_id"));
        doctor.setScheduler_id(rs.getLong("scheduler_id"));
        doctor.setRoom_id(rs.getLong("room_id"));
        doctor.setHospital_id(rs.getLong("hospital_id"));
        return doctor;
    }
}
