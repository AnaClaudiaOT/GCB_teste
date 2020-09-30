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

import com.gcbteste.gcbteste.Model.CidadeModel;
import com.gcbteste.gcbteste.Repository.CidadeRepository;

@RestController
@RequestMapping("/cidade")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CidadeController {
	
	@Autowired
	private CidadeRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CidadeModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/cidade/{cidade}")
	public ResponseEntity<List<CidadeModel>> getByCidade(@PathVariable String cidade){
		return ResponseEntity.ok(repository.findAllByCidadeContainingIgnoreCase(cidade));
	}

	@PostMapping
	public ResponseEntity<CidadeModel> post (@RequestBody CidadeModel cidade){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(cidade));
	}
	
	@PutMapping
	public ResponseEntity<CidadeModel> put (@RequestBody CidadeModel cidade){
		return ResponseEntity.ok(repository.save(cidade));				
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
