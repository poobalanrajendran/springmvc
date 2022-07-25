package com.chainsys.springmvc.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.pojo.Employee;
import com.chainsys.springmvc.service.DoctorService;
@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	DoctorService drservice;
	@GetMapping("/addform")
	public String showAddForm(Model model)
	{
		Doctor theDoc=new Doctor();
		model.addAttribute("adddoctor",theDoc);
		return "add-adddoctor-form";
	}
	@PostMapping("/add")
		public String addNewDoctors(@ModelAttribute("adddoctor") Doctor theDoc)
		{
		drservice.save(theDoc);
			return "redirect:/doctor/doctorlist";
		}
	
	@GetMapping("updateform")
	public String updatedoctors(@RequestParam("docid")int id,Model model)
	{
	Doctor theDoc=drservice.findById(id);
	model.addAttribute("updatedoctor",theDoc);
	return "update-doctor-form";
		
	}
@PostMapping("/updatedoc")
public String updateDoctors(@ModelAttribute("updatedoctor") Doctor theDoc)
{
	drservice.save(theDoc);
	return "redirect:/doctor/doctorlist";
}

@GetMapping("/deletedoctor")
public String deletedoctors(@RequestParam("docid") int id)
{
	drservice.deleteById(id);
	
	return "redirect:/doctor/doctorlist";
}

@GetMapping("/finddoctorbyid")
public String finddoctorsById(@RequestParam("docid")int id,Model model)
{
	Doctor thedoc=drservice.findById(id);//EmployeeDao.getEmployeeById(id);
	model.addAttribute("finddoctorid",thedoc);
	return "find-doctor-id-form";
}
	
		@GetMapping("/doctorlist")
	
		public String getAllDoctors(Model model)
		{
			List<Doctor>doclist =drservice.getDoctors();
			model.addAttribute("alldoctors",doclist);
			return "list-doctors";
		}
		@GetMapping("/gdetdocapp")
		public String getAppointments(@RequestParam("id") int id,Model model)
		{
			DoctorAppointmentsDTO dto=drservice.getDoctorAndAppointments(id);
			{
				model.addAttribute("getdoc",dto.getDoctor());
				model.addAttribute("applist",dto.getAppointments());
				return "list-doctor-appointments";
			}
		}
		
	@GetMapping("/trans")
	public void testTransaction(@RequestParam("id") int id)
	{
		DoctorAppointmentsDTO dto=new DoctorAppointmentsDTO();
		Doctor dr=new Doctor();
		dr.setDoctor_id(789);
		dr.setDoctor_name("poobalan");
		Date drdob=new Date(22,7,25);
		dr.setDob(drdob);
		dr.setCity("chennai");
		dr.setPhone_no(9876543219l);
		dr.setDoctor_speciality("heart");
		dr.setStandard_fees(700);
		dto.setDoctor(dr);
		List<Appointment> applist=new ArrayList<Appointment>();
		int nextAppId=drservice.getNextAppointmentId();
		for(int i=nextAppId;i<=nextAppId+2;i++)
		{
			Appointment app=new Appointment();
			app.setAppointment_id(i);
		Date appdt=new Date(22,7,25);
			app.setAppointment_date(appdt);
			app.getDoctor_id();
			app.setPatient_name("poobalan");
			app.setFees_collected(dr.getStandard_fees());
			dto.addAppointment(app);
		}
		drservice.addDoctorAndAppointments(dto);
		System.out.println("successfully");
	}
}
