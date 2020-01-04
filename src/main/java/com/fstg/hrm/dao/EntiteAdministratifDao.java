package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.hrm.bean.EntiteAdministratif;



public interface EntiteAdministratifDao extends JpaRepository<EntiteAdministratif, Long>{
 public EntiteAdministratif findByReference(String ref);
public void deleteByReference(String ref);
}
