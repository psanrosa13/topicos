package com.devcommunity.topico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devcommunity.topico.model.Topico;
import com.devcommunity.topico.service.TopicoService;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
	
	@Autowired
	private TopicoService topicoService;

	@GetMapping
	public List<Topico> lista(@RequestParam(value = "nome") String nome){
		return topicoService.lista(nome);
	}
	
}
