package com.example.demo;

public class TestModel {

	private int marks;
	private String subjectName;
	private String grade;
	public TestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestModel(int marks, String subjectName, String grade) {
		super();
		this.marks = marks;
		this.subjectName = subjectName;
		this.grade = grade;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
