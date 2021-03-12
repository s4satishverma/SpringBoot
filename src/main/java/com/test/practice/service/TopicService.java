package com.test.practice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.practice.model.Topic;

@Service
public class TopicService {
	
	private List<Topic> topic = Arrays.asList(
			new Topic("spring","spring framework","Spring framework desc"),
			new Topic("java","core java","Core java description"),
			new Topic("javascript","javascript jquery","javascript desc")
			);
	
	public List<Topic> getAllTopic(){
		return topic; 
	}
	
	public Topic getTopic(String id){
		return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

}
