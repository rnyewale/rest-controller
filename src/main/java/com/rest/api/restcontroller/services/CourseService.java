package com.rest.api.restcontroller.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rest.api.restcontroller.model.Course;
import com.rest.api.restcontroller.repo.CourseRepo1;

@Service
public class CourseService {

	@Autowired
	private CourseRepo1 courseRepo1;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		courseRepo1.findByTopicEntityId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourseById(String id) {
		return courseRepo1.findById(id).get();
	}

	public void createTopic(Course course) {
		courseRepo1.save(course);
	}

	public void updateCourse(Course course) {
		courseRepo1.save(course);
	}

	public void deleteCourseById(String topicId) {
		courseRepo1.deleteById(topicId);
	}

}
