package com.fstg.hrm.rest;

import com.fstg.hrm.bean.CommandeItem;
import com.fstg.hrm.service.impl.CommandeItemServiceImpl;
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
@RequestMapping("/stock-api/commandeItem")
public class CommandeItemRest {
@Autowired
private CommandeItemServiceImpl  commandeItemServiceImpl;
       @PostMapping("/")
public void save(@RequestBody CommandeItem commandeItem){
    commandeItemServiceImpl.save(commandeItem);
}     @GetMapping("/")
public List<CommandeItem> findAll(){
   return commandeItemServiceImpl.findAll();
}   
        @PutMapping(value = "/{id}")
public CommandeItem update(@PathVariable(name = "id")Long id, @RequestBody CommandeItem commandeItem){
    return commandeItemServiceImpl.update(id,commandeItem);
}
  @DeleteMapping(value = "/{id}")
public void delete(@PathVariable(name = "id")Long id){
    commandeItemServiceImpl.deleteById(id);
}

}
