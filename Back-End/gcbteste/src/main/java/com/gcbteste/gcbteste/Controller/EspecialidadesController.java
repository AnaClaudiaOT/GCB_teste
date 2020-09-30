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

import com.gcbteste.gcbteste.Model.EspecialidadesModel;
import com.gcbteste.gcbteste.Repository.EspecialidadesRepository;

@RestController
@RequestMapping("/especialidades")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EspecialidadesController {

	@Autowired
	private EspecialidadesRepository repository;

	@GetMapping
	public ResponseEntity<List<EspecialidadesModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/espec/{especialidade}")
	public ResponseEntity<List<EspecialidadesModel>> getByEspecialidade(@PathVariable String especialidade) {
		return ResponseEntity.ok(repository.findAllByEspecialidadeContainingIgnoreCase(especialidade));
	}

	@PostMapping
	public ResponseEntity<EspecialidadesModel> post(@RequestBody EspecialidadesModel especialidade) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(especialidade));
	}

	@PutMapping
	public ResponseEntity<EspecialidadesModel> put(@RequestBody EspecialidadesModel especialidade) {
		return ResponseEntity.ok(repository.save(especialidade));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
