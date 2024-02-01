package com.tarefa.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tarefas")
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Column(name = "datafinalExecucao")
	private String datafinalExecucao;
	
	@NotNull
	@Column(name = "descricaoTarefa")
	private String descricaoTarefa;
	
	@NotNull
	@Column(name = "statusTarefa")
	private String statusTarefa;
	

}
