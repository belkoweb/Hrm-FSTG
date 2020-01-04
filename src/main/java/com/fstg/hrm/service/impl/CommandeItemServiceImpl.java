package com.fstg.hrm.service.impl;

import com.fstg.hrm.bean.CommandeItem;
import com.fstg.hrm.dao.CommandeItemDao;
import com.fstg.hrm.service.CommandeItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommandeItemServiceImpl implements CommandeItemService {
     @Autowired
     private  CommandeItemDao commandeItemDao;
         
    @Override
    public void save(CommandeItem commandItem) {
        commandeItemDao.save(commandItem);
    }

    @Override
    public List<CommandeItem> findAll() {
        return commandeItemDao.findAll();
    }

    @Override
    public CommandeItem update( Long id, CommandeItem commandeItem) {
       commandeItem.setId(id); 
       return commandeItemDao.save(commandeItem);
    }
    @Override
    public void deleteById(Long id) {
        commandeItemDao.deleteById(id);
    }
	
}
