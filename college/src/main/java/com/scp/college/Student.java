package com.scp.college;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Studenttbl")
public class Student {
	
	
	@Id
	@GeneratedValue
	@Column(name="Student_Rno")
	private Long Student_Rno;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="cell_phone")
	private String cellphone;

	@OneToOne(mappedBy="student", cascade=CascadeType.ALL)
	private StudentDetail studentDetail;
	
	public Student() {
		
	}
	
	public Student(String firstname, String lastname, Date birthdate, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthdate;
		this.cellphone = phone;
		
	}

	public Long getStudent_Rno() {
		return Student_Rno;
	}

	public void setStudent_Rno(Long student_Rno) {
		Student_Rno = student_Rno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}


}
