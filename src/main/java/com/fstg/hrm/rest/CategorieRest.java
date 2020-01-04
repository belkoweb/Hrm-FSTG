package com.fstg.hrm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fstg.hrm.bean.Categorie;
import com.fstg.hrm.service.CategorieService;


public class CategorieRest {
	@Autowired
	private CategorieService categorieService;

	@PostMapping("/")
	public void save(@RequestBody Categorie categorie) {
		categorieService.save(categorie);
	}

	@GetMapping(value = "/liste")
	public List<Categorie> findAll() {
		return categorieService.findAll();
	}

	@GetMapping("/lib/{lib}")
	public Categorie findByLib(@PathVariable String lib) {
		return categorieService.findByLib(lib);

	}
}
