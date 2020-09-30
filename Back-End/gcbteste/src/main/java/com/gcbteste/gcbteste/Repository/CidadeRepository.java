package com.gcbteste.gcbteste.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcbteste.gcbteste.Model.CidadeModel;

public interface CidadeRepository extends JpaRepository<CidadeModel, Long> {
	public List<CidadeModel> findAllByCidadeContainingIgnoreCase(String cidade);

}
