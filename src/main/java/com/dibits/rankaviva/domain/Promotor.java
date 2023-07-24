package com.dibits.rankaviva.domain;

import java.io.Serializable;
import java.util.Objects;

public class Promotor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nome;
	private int clientesEmSala;
	private int clientesVendidos;
	private String area;

	public Promotor(Integer id, String nome, int clientesEmSala, int clientesVendidos, String area	) {
		super();
		this.id = id;
		this.nome = nome;
		this.clientesEmSala = clientesEmSala;
		this.clientesVendidos = clientesVendidos;
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

	public int getClientesEmSala() {
		return clientesEmSala;
	}

	public void setClientesEmSala(int clientesEmSala) {
		this.clientesEmSala = clientesEmSala;
	}

	public int getClientesVendidos() {
		return clientesVendidos;
	}

	public void setClientesVendidos(int clientesVendidos) {
		this.clientesVendidos = clientesVendidos;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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
// Construtores, getters e setters

// ...
