package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.Commande;


public interface CommandeService {
	
	public void save(Commande commande);

	public List<Commande> findAll();

	public Commande findByRef(String ref);

	public Commande update(Long id, Commande commande);

	public void deleteById(Long id);
	
	
}
