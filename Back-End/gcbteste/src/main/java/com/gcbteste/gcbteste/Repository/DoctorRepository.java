package com.gcbteste.gcbteste.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcbteste.gcbteste.Model.DoctorModel;


@Repository
public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {
	public List<DoctorModel> findAllByNomeContainingIgnoreCase( String nome);
}
