package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.hrm.bean.Commande;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {
	public  Commande findByRef(String ref);
}




















//@CrossOrigin("*")//Autoriser tous les noms de domaines d'acceder
