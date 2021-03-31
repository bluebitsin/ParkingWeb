package com.bluebitsin.parkingweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bluebitsin.parkingweb.model.Courses;
import com.bluebitsin.parkingweb.services.CourseService;

@RestController
public class CoursesController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "This is home page.";
	}
	
	@GetMapping("/courses")
	public List<Courses> getAllCourses(){
		
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourses(@PathVariable String courseId) {
		
		return this.courseService.getSingleCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path = "/courses", consumes = "application/json")
	public Courses addCourse(@RequestBody Courses course) {
		
		return this.courseService.addCourse(course);
	}
	
}
