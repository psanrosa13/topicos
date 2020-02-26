package com.devcommunity.topico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcommunity.topico.model.Topico;
import com.devcommunity.topico.repository.TopicoRepository;

@Service
public class TopicoService {

	@Autowired
	MeetupService meetupService;
	
	@Autowired
	TopicoRepository topicoRepository;
	
	public List<Topico> lista(String nome) {
		List<Topico> topicos = topicoRepository.findAll(nome);
		
		if(topicos != null && !topicos.isEmpty()) {
			return topicos;
		}
		
		topicos = meetupService.findTopicList(nome);

		if(topicos != null && !topicos.isEmpty()) {
			topicoRepository.saveAll(topicos);
		}
		
		return topicos;
	}
	
}
