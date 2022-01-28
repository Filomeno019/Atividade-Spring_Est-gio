package com.example.apiRest.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
public class Cliente implements Serializable{
	
	public Cliente() {}
	
	private static final long serialVersionUID = 1L;
	
	@Id //mapeamento com JPA
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	private String datanasc;
	private String rg;
	private String cpf;
	private String telefone;
	
	//Getters and Setters
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
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
//	
	//Construtor padrão
	public Cliente(Integer id, String nome, String datanasc, String rg, String cpf, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.datanasc = datanasc;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
//	//hashCode() and equals() - Com base no ID pra se for feita uma comparação
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cliente other = (Cliente) obj;
//		return Objects.equals(id, other.id);
//	}

}
