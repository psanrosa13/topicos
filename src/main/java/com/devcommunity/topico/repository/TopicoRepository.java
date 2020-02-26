package com.devcommunity.topico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devcommunity.topico.model.Topico;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long>{

	@Query("SELECT t FROM Topico t WHERE t.nome LIKE '%:nome%'")
	List<Topico> findAll(String nome);

}
