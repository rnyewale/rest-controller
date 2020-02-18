package com.rest.api.restcontroller.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.restcontroller.model.TopicEntity;

@Repository
public interface TopicRepository extends JpaRepository<TopicEntity, String> {

}
