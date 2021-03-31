package com.bluebitsin.parkingweb.services;

import java.util.List;

import com.bluebitsin.parkingweb.model.Courses;

public interface CourseService {

	public List<Courses> getCourses();
	
	public Courses getSingleCourse(long id);
	
	public Courses addCourse(Courses course);
}
