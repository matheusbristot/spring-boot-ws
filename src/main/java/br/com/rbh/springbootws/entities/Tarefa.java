package br.com.rbh.springbootws.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "poc")
public class Tarefa {

	@Id
	@SequenceGenerator(name = "seq_tarefa", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarefa")
	private Long id;
	
	private String nome;
	
	private String descricao; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
