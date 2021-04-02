package com.bluebitsin.parkingweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.dao.CourseDao;
import com.bluebitsin.parkingweb.model.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl(){
		
		
	}
	
	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Courses getSingleCourse(long id) {
		
		return this.courseDao.getOne(id);
	}

	@Override
	public Courses addCourse(Courses course) {
		
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Courses updateCourse(Courses course) {
		
		courseDao.save(course);
		return  course;
		
	}
	
	@Override
	public Courses deleteCourse(long courseId) {
		
		Courses course = getSingleCourse(courseId);
		courseDao.delete(course);
		return course;
	}
		
		
		
}
