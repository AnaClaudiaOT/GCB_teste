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
import com.gcbteste.gcbteste.Model.DoctorModel;
import com.gcbteste.gcbteste.Repository.DoctorRepository;


@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {
	
	@Autowired
	private DoctorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<DoctorModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<DoctorModel>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}

	@PostMapping
	public ResponseEntity<DoctorModel> post (@RequestBody DoctorModel doctor){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(doctor));
	}
	
	@PutMapping
	public ResponseEntity<DoctorModel> put (@RequestBody DoctorModel doctor){
		return ResponseEntity.ok(repository.save(doctor));				
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
