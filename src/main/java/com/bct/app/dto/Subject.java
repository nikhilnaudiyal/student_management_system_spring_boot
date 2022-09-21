package com.bct.app.dto;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="subject")
public class Subject {

//	@ManyToOne(targetEntity = StudentInfo.class)
//	StudentInfo studentInfo;
//	
//	@Column(name="student_id")
//	private int studentId;
	
	@Column(name="branch_code")
	private int branchCode;
	
	@Column(name="sem_number")
	private int semNumber;

	@Id
	@Column(name="subject_code")
	private int subjectCode;
	
	@Column(name="subject_name")
	private String subjectName;
	
	
//	public StudentInfo getStudentInfo() {
//		return studentInfo;
//	}
//
//	public void setStudentInfo(StudentInfo studentInfo) {
//		this.studentInfo = studentInfo;
//	}

//	public int getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public int getSemNumber() {
		return semNumber;
	}

	public void setSemNumber(int semNumber) {
		this.semNumber = semNumber;
	}
	
	
	
}
