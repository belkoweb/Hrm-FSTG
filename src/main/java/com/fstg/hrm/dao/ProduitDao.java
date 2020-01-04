package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.hrm.bean.Produit;


@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

}
