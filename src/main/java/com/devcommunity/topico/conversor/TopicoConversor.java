package com.devcommunity.topico.conversor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.devcommunity.topico.DTO.TopicDTO;
import com.devcommunity.topico.model.Topico;

@Component
public class TopicoConversor {

	public Topico topicDTOToTopico(TopicDTO TopicDTO) {
		Topico topico = new Topico();
		topico.setDescricao(TopicDTO.getDescription());
		topico.setNome(TopicDTO.getName());
		
		return topico;
	}
	
	public List<Topico> topicDTOToTopico(List<TopicDTO> dtos){
		List<Topico> topicos = new ArrayList<Topico>();
		
		for (TopicDTO topicDTO : dtos) {
			topicos.add(topicDTOToTopico(topicDTO));
		}
		
		return topicos;
	}
	
}
