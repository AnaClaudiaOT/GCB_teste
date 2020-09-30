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
@Table(name = "tb_estado")

public class EstadoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String estado;

	@OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("estado")
	private List<DoctorModel> doctor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<DoctorModel> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<DoctorModel> doctor) {
		this.doctor = doctor;
	}

}
