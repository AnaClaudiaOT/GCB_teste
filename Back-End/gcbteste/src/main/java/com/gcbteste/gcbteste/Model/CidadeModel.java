package com.gcbteste.gcbteste.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_cidade")
public class CidadeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String cidade;

	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cidade")
	private List<DoctorModel> doctor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<DoctorModel> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<DoctorModel> doctor) {
		this.doctor = doctor;
	}

}
