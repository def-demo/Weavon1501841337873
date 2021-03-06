package com.altimetrik.v_p.api.service;

import com.altimetrik.v_p.models.PgSkillTrackMstr;


import com.altimetrik.v-p.exception.NotFoundException;
import java.util.List;

public interface PgSkillTrackMstrApiService {
  
      List<PgSkillTrackMstr> findAllPgSkillTrackMstr()
      throws NotFoundException;
  
      PgSkillTrackMstr updatePgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr)
      throws NotFoundException;
  
      PgSkillTrackMstr addPgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr)
      throws NotFoundException;
  
      PgSkillTrackMstr findByIdPgSkillTrackMstr(Long id)
      throws NotFoundException;
  
      void deletePgSkillTrackMstr(Long id)
      throws NotFoundException;
  
}

