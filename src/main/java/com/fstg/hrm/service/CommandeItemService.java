package com.fstg.hrm.service;

import com.fstg.hrm.bean.CommandeItem;
import java.util.List;



public interface CommandeItemService {
   public void save( CommandeItem commandItem);	
   public List<CommandeItem> findAll();
   public CommandeItem update(Long id,CommandeItem commandeItem);
   public void deleteById(Long id);
}