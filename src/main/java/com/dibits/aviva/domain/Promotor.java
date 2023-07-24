package com.dibits.aviva.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

//CLASSE CATEGORIA
@Entity
public class Promotor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer cs;
	private Integer cv;
	private String area;
	
	@JsonManagedReference
	@ManyToMany(mappedBy = "promotores")
	private List<Ranking> rankings = new ArrayList<>();

	public Promotor() {
		
	}

	public Promotor(Integer id, String nome, Integer cs, Integer cv, String area) {
		super();
		this.id = id;
		this.nome = nome;
		this.cs = cs;
		this.cv = cv;
		this.area = area;
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

	public Integer getCs() {
		return cs;
	}

	public void setCs(Integer cs) {
		this.cs = cs;
	}

	public Integer getCv() {
		return cv;
	}

	public void setCv(Integer cv) {
		this.cv = cv;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public List<Ranking> getRankings() {
		return rankings;
	}

	public void setRankings(List<Ranking> rankings) {
		this.rankings = rankings;
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
		Promotor other = (Promotor) obj;
		return Objects.equals(id, other.id);
	}

}

