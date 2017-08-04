package com.altimetrik.v_p.api.service;

import com.altimetrik.v_p.models.PgSkillTrackDtls;


import com.altimetrik.v-p.exception.NotFoundException;
import java.util.List;

public interface PgSkillTrackDtlsApiService {
  
      List<PgSkillTrackDtls> findAllPgSkillTrackDtls()
      throws NotFoundException;
  
      PgSkillTrackDtls updatePgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls)
      throws NotFoundException;
  
      PgSkillTrackDtls addPgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls)
      throws NotFoundException;
  
      PgSkillTrackDtls findByIdPgSkillTrackDtls(Long id)
      throws NotFoundException;
  
      void deletePgSkillTrackDtls(Long id)
      throws NotFoundException;
  
}

