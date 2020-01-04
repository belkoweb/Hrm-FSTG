package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.hrm.bean.CommandeItem;



@Repository
public interface CommandeItemDao extends JpaRepository<CommandeItem, Long> {

}
