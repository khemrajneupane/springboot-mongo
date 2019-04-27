package fi.employee.employeerecord.domain;

import java.util.ArrayList;
import java.util.List;

//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name= "Employee")

@Document(collection = "employee")
public class Employee {
	
	@Id
	@Field
	private String id;
	@Field
	private String fname;
	@Field
	private String lname;
	@Field
	private String email;
	@Field
	private String phone;
	@Field
	private String address;
	@DBRef
	private List<Department> department = new ArrayList<>();
	@DBRef
	private List<Task> task= new ArrayList<>();
//	public Employee(String fname, String lname, String email, String phone, String address, Department department, Task task) {
//		super();
//		this.fname = fname;
//		this.lname = lname;
//		this.email = email;
//		this.phone = phone;
//		this.address = address;
//		this.department = department;
//		this.task = task;
//	}
	
	public Employee() {
		super();
	}


	public Employee(String fname, String lname, String email, String phone, String address, List<Department> department,
			List<Task> task) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.department = department;
		this.task = task;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
public List<Department> getDepartment() {
		return department;
	}


	public void setDepartment(List<Department> department) {
		this.department = department;
	}


	public List<Task> getTask() {
		return task;
	}


	public void setTask(List<Task> task) {
		this.task = task;
	}


	//	public Department getDepartment() {
//		return department;
//	}
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//	public Task getTask() {
//		return task;
//	}
//	public void setTask(Task task) {
//		this.task = task;
//	}
	@Override
	public String toString() {
		return String.format(
				"Employee [id=%s, fname=%s, lname=%s, email=%s, phone=%s, address=%s, department=%s, task=%s]", id,
				fname, lname, email, phone, address, department, task);
	}

}