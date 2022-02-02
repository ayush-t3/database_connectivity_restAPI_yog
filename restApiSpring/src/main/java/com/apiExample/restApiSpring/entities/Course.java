package com.apiExample.restApiSpring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private long id;
	private String CourseName;
	private String Description;
	
	
	/**
	 * 
	 */
	public Course() {
		super();
	}
	/**
	 * @param id
	 * @param courseName
	 * @param description
	 */
	public Course(long id, String courseName, String description) {
		super();
		this.id = id;
		CourseName = courseName;
		Description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", CourseName=" + CourseName + ", Description=" + Description + "]";
	}
	
	
}
