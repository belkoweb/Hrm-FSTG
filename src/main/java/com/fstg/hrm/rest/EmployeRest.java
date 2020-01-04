package com.fstg.hrm.rest;

import com.fstg.hrm.bean.Employe;
import com.fstg.hrm.service.impl.EmployeServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock-api/employe")
public class EmployeRest {
    @Autowired
    private  EmployeServiceImpl employeServiceImpl;
     @PostMapping("/")       
    public void save(@RequestBody Employe employe){
        employeServiceImpl.save(employe);
    }
    @GetMapping("/")
    public List<Employe> findAll(){
        return employeServiceImpl.findAll();
    }
    @GetMapping(value = "/cne/{cne}")
    public Employe findByEmploye(@PathVariable(name="cne")String cne){
        return employeServiceImpl.findByCne(cne);
    }
    @PutMapping(value = "/{id}")
    public Employe update(@PathVariable(name = "id") Long id, @RequestBody Employe employe){
        return employeServiceImpl.update(id, employe);
                
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        employeServiceImpl.deleteById(id);
    }

}
