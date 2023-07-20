package com.example.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Name is required")
    private String name;
    
    @NotNull(message = "Age is required")
    @Min(value = 1, message = "Age must be greater than or equal to 1")
    private int age;
    
    @NotBlank(message = "Room is required")
    private String room;
    
    @NotBlank(message = "Doctor name is required")
    private String doctorName;
    
    @NotNull(message = "Admit date is required")
    private LocalDate admitDate;
    
    private double expenses;
    
    @NotBlank(message = "Status is required")
    private String status;
    
    
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(Long id, String name, int age, String room, String doctorName, LocalDate admitDate, double expenses,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.room = room;
		this.doctorName = doctorName;
		this.admitDate = admitDate;
		this.expenses = expenses;
		this.status = status;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public LocalDate getAdmitDate() {
		return admitDate;
	}


	public void setAdmitDate(LocalDate admitDate) {
		this.admitDate = admitDate;
	}


	public double getExpenses() {
		return expenses;
	}


	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
    
    
}
