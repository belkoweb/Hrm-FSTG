package com.fstg.hrm.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.hrm.bean.Commande;
import com.fstg.hrm.dao.CommandeDao;
import com.fstg.hrm.service.CommandeService;


@Service
public class CommandeServiceImpl implements CommandeService {
	@Autowired
	private CommandeDao commandeDao;

	@Override
	public void save(Commande commande) {
		commandeDao.save(commande);
	}

	@Override
	public List<Commande> findAll() {

		return commandeDao.findAll();
	}

	@Override
	public Commande findByRef(String ref) {
		return commandeDao.findByRef(ref);
	}

	@Override
	public Commande update(Long id, Commande commande) {
		commande.setId(id);
		return commandeDao.save(commande);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		commandeDao.deleteById(id);
	}

}
