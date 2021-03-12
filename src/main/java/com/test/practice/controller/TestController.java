package com.test.practice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.practice.model.Topic;
import com.test.practice.service.TopicService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class TestController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/show")
	public static String show() {
	 System.out.println("..........................................................hiii");
	 return "hiiiii";
	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic(){
		return topicService.getAllTopic();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id){
		//System.out.println(".................."+id);
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value="/addTopic", method=RequestMethod.POST)
	public void addTopic(Topic topic) {
	System.out.println(topic.getId());
	System.out.println(topic.getName());
	System.out.println(topic.getDesc());
	}
	
	
	
	
}
