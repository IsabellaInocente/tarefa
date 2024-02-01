package com.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarefa.entites.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
