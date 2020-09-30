package com.gcbteste.gcbteste.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcbteste.gcbteste.Model.EspecialidadesModel;

public interface EspecialidadesRepository extends JpaRepository<EspecialidadesModel, Long> {
	public List<EspecialidadesModel> findAllByEspecialidadeContainingIgnoreCase(String especialidade);
}
