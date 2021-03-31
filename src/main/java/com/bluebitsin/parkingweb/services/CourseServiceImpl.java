package com.bluebitsin.parkingweb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.model.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	
	public CourseServiceImpl(){
		
		list = new ArrayList<>();
		list.add(new Courses(1,"Java","I love Java"));
		list.add(new Courses(2,"Android","I am a Android developer for very long time."));
		
	}
	
	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getSingleCourse(long id) {
		
		Courses c = null;
		
		for(Courses course : list) {
			
			if(course.getId() == id) {
				
				c = course; 
				break;
				
			}
			
		}
		
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		
		list.add(course);
		
		return course;
	}

}
