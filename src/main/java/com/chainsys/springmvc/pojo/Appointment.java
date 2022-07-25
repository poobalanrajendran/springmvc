package com.chainsys.springmvc.pojo;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appoint")

public class Appointment {
	@Id
private int appointment_id;
	private int doctor_id;
	private String appointment_name;
	private Date appointment_date;
	private String patient_name;
	private float fees_collected;

public int getAppointment_id() {
		return appointment_id;
	}
	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}
	public String getAppointment_name() {
		return appointment_name;
	}
	public void setAppointment_name(String appointment_name) {
		this.appointment_name = appointment_name;
	}
	public Date getAppointment_date() {
		return appointment_date;
	}
	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public float getFees_collected() {
		return fees_collected;
	}
	public void setFees_collected(float fees_collected) {
		this.fees_collected = fees_collected;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}



}
