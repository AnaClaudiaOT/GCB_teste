package com.gcbteste.gcbteste.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gcbteste.gcbteste.Model.EstadoModel;

public interface EstadoRepository extends JpaRepository<EstadoModel,Long> {
	public List<EstadoModel> findAllByEstadoContainingIgnoreCase(String estado);
}
