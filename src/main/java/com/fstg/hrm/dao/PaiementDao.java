package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.hrm.bean.Paiement;


@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {

}
