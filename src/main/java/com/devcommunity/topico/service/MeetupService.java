package com.devcommunity.topico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.devcommunity.topico.conversor.TopicoConversor;
import com.devcommunity.topico.DTO.TopicDTO;
import com.devcommunity.topico.model.Topico;

@Service
public class MeetupService {
	
	@Value("${url.meetup.topic.get}")
	private String URL_MEETUP_TOPIC;
	
	@Autowired
	private TopicoConversor topicoConversor;

	public List<Topico> findTopicList(String nome) {
		WebClient webClient = WebClient.create();
		
		 ResponseEntity<List<TopicDTO>> response = webClient.get()
	         .uri(URL_MEETUP_TOPIC+"?query="+nome.toLowerCase())
	         .header("page", "1")
	         .retrieve()
	         .toEntityList(TopicDTO.class)
	         .block();
		 
		 if (response.getBody().isEmpty()) {
			return null;
		}
		 
		return topicoConversor.topicDTOToTopico(response.getBody());
	}

}
