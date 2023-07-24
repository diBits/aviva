package com.dibits.aviva.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class Ranking implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private LocalDate data;
	
	@ManyToMany
	@JoinTable(name = "RANKING_PROMOTOR",
		joinColumns = @JoinColumn(name = "ranking_id"),
		inverseJoinColumns = @JoinColumn(name = "promotor_id")
			)
	private List<Promotor> promotores = new ArrayList<>();
	
	public Ranking() {
		
	}

	public Ranking(Integer id, String nome, LocalDate data) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Promotor> getPromotores() {
		return promotores;
	}

	public void setPromotores(List<Promotor> promotores) {
		this.promotores = promotores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ranking other = (Ranking) obj;
		return Objects.equals(id, other.id);
	}

	
}
