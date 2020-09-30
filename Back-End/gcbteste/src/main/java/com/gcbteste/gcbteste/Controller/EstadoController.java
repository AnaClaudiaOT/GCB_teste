package com.gcbteste.gcbteste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gcbteste.gcbteste.Model.EstadoModel;
import com.gcbteste.gcbteste.Repository.EstadoRepository;

@RestController
@RequestMapping("/estado")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EstadoController {

	@Autowired
	private EstadoRepository repository;

	@GetMapping
	public ResponseEntity<List<EstadoModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/estado/{estado}")
	public ResponseEntity<List<EstadoModel>> getByEstado(@PathVariable String estado) {
		return ResponseEntity.ok(repository.findAllByEstadoContainingIgnoreCase(estado));
	}

	@PostMapping
	public ResponseEntity<EstadoModel> post(@RequestBody EstadoModel estado) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(estado));
	}

	@PutMapping
	public ResponseEntity<EstadoModel> put(@RequestBody EstadoModel estado) {
		return ResponseEntity.ok(repository.save(estado));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
