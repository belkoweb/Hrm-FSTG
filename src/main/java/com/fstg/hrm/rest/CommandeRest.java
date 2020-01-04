package com.fstg.hrm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.hrm.bean.Commande;
import com.fstg.hrm.service.CommandeService;

@RestController
@RequestMapping("/stock-api/commande")
public class CommandeRest {
	@Autowired
	private CommandeService commandeService;
	@PostMapping("/")
	public void save(@RequestBody Commande commande) {
		commandeService.save(commande);
	} 

	@GetMapping(value = "/")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}

	@GetMapping(value = "/ref/{ref}")
	public Commande findByRef(@PathVariable(name = "ref") String ref) {
		return commandeService.findByRef(ref);

	}

	@PutMapping(value = "/{id}")
	public Commande update(@PathVariable(name = "id") Long id, @RequestBody Commande commande) {
		return commandeService.update(id, commande);
	}


	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		commandeService.deleteById(id);
	}
	
}
