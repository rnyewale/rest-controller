package com.rest.api.restcontroller.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.api.restcontroller.model.Topic;

/*Services are basically singleton classes*/

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("Id-101", "John Molar", "Spring Frsmework"),
			new Topic("Id-102", "Spring framework", "Spring Data Jpa"),
			new Topic("Id-103", "John Molar", "Spring Rest"),
			new Topic("Id-104", "Robert Daney", "Spring Boot"))
			);

	
	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(String Id) {
		return topics.stream().filter(id -> id.getId().equals(Id)).findFirst().get();
	}

	public void createTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String Id, Topic topic) {
		/*
		 * topics.stream().filter(id -> id.getId().equals(Id))
		 * .findFirst().map(topic.setDescription(topic.getDescription()));
		 */
		
		for (int i = 0; i < topics.size(); i++) {
			if (Id.equals(topics.get(i).getId())) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String topicId) {
		topics.removeIf(id -> id.getId().equals(topicId));		
	}
}
