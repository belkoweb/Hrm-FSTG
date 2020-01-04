package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.hrm.bean.Categorie;


@Repository
public interface CategorieDao  extends JpaRepository<Categorie, Long> {
  public Categorie findByLib(String lib);
}
