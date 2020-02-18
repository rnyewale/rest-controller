package com.rest.api.restcontroller.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.restcontroller.model.TopicEntity;
import com.rest.api.restcontroller.repo.TopicRepository;

@Service
public class TopicServiceJpa {

	@Autowired
	private TopicRepository topicRepo;

	public List<TopicEntity> getAllTopics() {
		List<TopicEntity> topics = new ArrayList<TopicEntity>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	public TopicEntity getTopicById(String id) {
		return topicRepo.findById(id).get();
	}

	public void createTopic(TopicEntity topic) {
		topicRepo.save(topic);
	}

	public void updateTopic(String id, TopicEntity entity) {
		topicRepo.save(entity);
	}
	
	public void deleteTopicById(String id) {
		topicRepo.deleteById(id);
	}
}
