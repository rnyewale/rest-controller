package com.rest.api.restcontroller.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.restcontroller.model.Course;

@Repository
public interface CourseRepo1 extends JpaRepository<Course, String> {

	public List<Course> findByTopicEntityId(String topicId);
}


