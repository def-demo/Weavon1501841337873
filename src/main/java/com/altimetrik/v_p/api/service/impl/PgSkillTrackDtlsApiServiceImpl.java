package com.altimetrik.v_p.api.service.impl;

import com.altimetrik.v_p.api.service.*;
import com.altimetrik.v_p.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.v_p.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.v_p.models.PgSkillTrackDtls;


import java.util.List;
import com.altimetrik.v-p.exception.NotFoundException;


@Service
@Transactional
public class PgSkillTrackDtlsApiServiceImpl implements PgSkillTrackDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgSkillTrackDtlsRepository  pgSkillTrackDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgSkillTrackDtls> findAllPgSkillTrackDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgSkillTrackDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackDtls updatePgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls)
      throws NotFoundException {
      
         
        	return pgSkillTrackDtlsRepository.save(pgSkillTrackDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackDtls addPgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls)
      throws NotFoundException {
      
         
        	return pgSkillTrackDtlsRepository.save(pgSkillTrackDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackDtls findByIdPgSkillTrackDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgSkillTrackDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgSkillTrackDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

