package com.altimetrik.v_p.api.service.impl;

import com.altimetrik.v_p.api.service.*;
import com.altimetrik.v_p.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.v_p.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.v_p.models.PgUserInfoMstr;


import java.util.List;
import com.altimetrik.v-p.exception.NotFoundException;


@Service
@Transactional
public class PgUserInfoMstrApiServiceImpl implements PgUserInfoMstrApiService {
		  	  
	  @Autowired
	
  	  private PgUserInfoMstrRepository  pgUserInfoMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgUserInfoMstr> findAllPgUserInfoMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgUserInfoMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoMstr updatePgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException {
      
         
        	return pgUserInfoMstrRepository.save(pgUserInfoMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoMstr addPgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException {
      
         
        	return pgUserInfoMstrRepository.save(pgUserInfoMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoMstr findByIdPgUserInfoMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgUserInfoMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgUserInfoMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

