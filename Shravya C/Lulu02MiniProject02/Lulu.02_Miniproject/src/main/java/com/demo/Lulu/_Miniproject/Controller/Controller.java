package com.demo.Lulu._Miniproject.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Lulu._Miniproject.Entity.Clothes;
import com.demo.Lulu._Miniproject.Repository.ClothesRepository;

@RestController
public class Controller {

			@Autowired

			ClothesRepository clothesRepository;

			@GetMapping("/getProduct")
			public List<Clothes> getJPQL() {
				return clothesRepository.findAll(); // select * from <TableName>;
			}

			
			@PostMapping("/addProduct")
			public Clothes createuser(@RequestBody Clothes prod) {
				return clothesRepository.save(prod);
			}

			
			@DeleteMapping("/delProduct/{id}")
			public void delProduct(@PathVariable("id")Integer id) {
				clothesRepository.deleteById(id);
			}

			
			@PutMapping("/UpdateProduct/{id}")
			public ResponseEntity<Object> updateShipping(@RequestBody Clothes clothes, @PathVariable long id) {
		Optional<Clothes> clothesOptional = clothesRepository.findById((int) id);
			if (clothesOptional.isEmpty())
			return ResponseEntity.notFound().build();
			clothes.setId(id);
			clothesRepository.save(clothes);
			return ResponseEntity.noContent().build();

	}
}
