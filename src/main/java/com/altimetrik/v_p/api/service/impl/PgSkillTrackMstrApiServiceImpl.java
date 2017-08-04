package com.altimetrik.v_p.api.service.impl;

import com.altimetrik.v_p.api.service.*;
import com.altimetrik.v_p.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.v_p.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.v_p.models.PgSkillTrackMstr;


import java.util.List;
import com.altimetrik.v-p.exception.NotFoundException;


@Service
@Transactional
public class PgSkillTrackMstrApiServiceImpl implements PgSkillTrackMstrApiService {
		  	  
	  @Autowired
	
  	  private PgSkillTrackMstrRepository  pgSkillTrackMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgSkillTrackMstr> findAllPgSkillTrackMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgSkillTrackMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackMstr updatePgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr)
      throws NotFoundException {
      
         
        	return pgSkillTrackMstrRepository.save(pgSkillTrackMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackMstr addPgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr)
      throws NotFoundException {
      
         
        	return pgSkillTrackMstrRepository.save(pgSkillTrackMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackMstr findByIdPgSkillTrackMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgSkillTrackMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgSkillTrackMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

