package com.rest.api.restcontroller.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.restcontroller.model.Topic;
import com.rest.api.restcontroller.services.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/topics")
	public List<Topic> getAllTopics() {
		return  topicService.getAllTopics();
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = ("/topics/{topicId}"))
	public Topic getTopicById(@PathVariable String topicId) {
		return topicService.getTopicById(topicId);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = ("/save"))
	public void createTopic(@RequestBody Topic topic) {
		topicService.createTopic(topic);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value = ("/update/{topicId}"))
	public void updateTopic(@PathVariable String topicId, @RequestBody Topic topic) {
		topicService.updateTopic(topicId, topic);
	}
	
	@RequestMapping(method =RequestMethod.DELETE, value = ("/delete/{topicId}"))
	public void deleteTopic(@PathVariable String topicId) {
		topicService.deleteTopic(topicId);
	}
}
 