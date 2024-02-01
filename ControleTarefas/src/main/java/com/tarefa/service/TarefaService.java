package com.tarefa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarefa.entites.Tarefa;
import com.tarefa.repository.TarefaRepository;

@Service
public class TarefaService {
	private final TarefaRepository tarefaRepository;
	
	@Autowired
	public TarefaService(TarefaRepository tarefaRepository) {
		this.tarefaRepository = tarefaRepository;
	}
	public List<Tarefa> buscaTodasTarefas(){
		return tarefaRepository.findAll();
	}
	
	public Tarefa buscaTarefaId(Long id) {
		Optional <Tarefa> Tarefa = tarefaRepository.findById(id);
		return Tarefa.orElse(null);
	}
	
	public Tarefa salvaTarefa(Tarefa Tarefa) {
		return tarefaRepository.save(Tarefa);
	}
	public Tarefa alterarTarefa(Long id, Tarefa alterarU) {
		Optional <Tarefa> existeTarefa = tarefaRepository.findById(id);
		if(existeTarefa.isPresent()) {
			alterarU.setId(id);
			return tarefaRepository.save(alterarU);
		}
		return null;
	}
	public boolean apagarTarefa(Long id) {
		Optional <Tarefa> existeTarefa = tarefaRepository.findById(id);
		if (existeTarefa.isPresent()) {
			tarefaRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
