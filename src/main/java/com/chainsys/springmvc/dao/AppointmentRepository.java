package com.chainsys.springmvc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.springmvc.pojo.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
    Appointment findById(int id) ;
     Appointment save(Appointment app);       //used for adding a new doctor and modifying the doctor.
    void deleteById(int id);
    
    List<Appointment> findAll();
    //define a native query for this method
        int getNextId();
}