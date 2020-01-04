package com.fstg.hrm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fstg.hrm.bean.EntiteAdministratif;
import com.fstg.hrm.service.impl.EntiteAdministratifServiceImpl;
@RestController
@RequestMapping("/stock-api/EntiteAdministratif")
public class EntiteAdministratifRest {
   @Autowired
   private EntiteAdministratifServiceImpl entiteAdministratifServiceImpl;
   @PostMapping(value="/")
   public void save(@RequestBody EntiteAdministratif entiteAdministratif) {
		entiteAdministratifServiceImpl.save(entiteAdministratif);
   }
   @GetMapping(value="/")
   public List<EntiteAdministratif> findAll() {
		return entiteAdministratifServiceImpl.findAll();
	}
   @GetMapping(value="/ref/{ref}")
   public EntiteAdministratif findByRef(@PathVariable(name = "ref") String ref) {
		return entiteAdministratifServiceImpl.findByReference(ref);
	}
   @DeleteMapping(value="/ref/{ref}")
   public void deleteByReference( @PathVariable(name= "ref") String ref)
	{
		entiteAdministratifServiceImpl.deleteByReference(ref);
	}
}
