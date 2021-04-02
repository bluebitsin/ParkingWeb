package com.bluebitsin.parkingweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluebitsin.parkingweb.model.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> {


}
 