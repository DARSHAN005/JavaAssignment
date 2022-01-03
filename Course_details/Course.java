package com.hibernate.Course_details;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	private int courseId;
	private String courseName;
	private int coursePrices;
	private String courseDuration;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePrices() {
		return coursePrices;
	}
	public void setCoursePrices(int coursePrices) {
		this.coursePrices = coursePrices;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseId + ", CourseName=" + courseName + ", CoursePrice=" + coursePrices
				+ ", courseDuration=" + courseDuration + "]";
	}
}
