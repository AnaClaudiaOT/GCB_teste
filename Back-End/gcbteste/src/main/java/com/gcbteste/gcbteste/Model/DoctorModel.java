package com.gcbteste.gcbteste.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_doctor")
public class DoctorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome_medico")
	@NotNull
	private String nome;

	@NotNull
	private String crm;

	@NotNull
	private String telefone;

	@ManyToOne
	@JsonIgnoreProperties("doctor")
	private CidadeModel cidade;

	@ManyToOne
	@JsonIgnoreProperties("doctor")
	private EstadoModel estado;
	
	@ManyToOne
	@JsonIgnoreProperties("doctor")
	private EspecialidadesModel especialidade;

	public EspecialidadesModel getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(EspecialidadesModel especialidade) {
		this.especialidade = especialidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public CidadeModel getCidade() {
		return cidade;
	}

	public void setCidade(CidadeModel cidade) {
		this.cidade = cidade;
	}

	public EstadoModel getEstado() {
		return estado;
	}

	public void setEstado(EstadoModel estado) {
		this.estado = estado;
	}

}
