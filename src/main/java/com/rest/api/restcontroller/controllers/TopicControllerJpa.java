package com.rest.api.restcontroller.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.restcontroller.model.TopicEntity;
import com.rest.api.restcontroller.services.TopicServiceJpa;

@RestController
public class TopicControllerJpa {

	@Autowired
	private TopicServiceJpa topicServiceJpa;

//	@RequestMapping(method = RequestMethod.GET, value = "/alltopics")
//	public List<TopicEntity> getAllTopics() {
//		return topicServiceJpa.getAllTopics();
//	}

	@RequestMapping(method = RequestMethod.GET, value = "/topic/{id}")
	public TopicEntity getTopicById(@PathVariable String id) {
		return topicServiceJpa.getTopicById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = ("/savetopic"))
	public void createTopic(@RequestBody TopicEntity entity) {
		topicServiceJpa.createTopic(entity);
	}

	@RequestMapping(method = RequestMethod.PUT, value = ("/updatetopic/{id}"))
	public void updateTopic(@PathVariable String id, @RequestBody TopicEntity topicEntity) {
		topicServiceJpa.updateTopic(id, topicEntity);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = ("/deletetopic/{id}"))
	public void deleteTopicById(@PathVariable String id) {
		topicServiceJpa.deleteTopicById(id);
	}
}