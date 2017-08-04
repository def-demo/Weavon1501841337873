package com.altimetrik.v_p.api.service;

import com.altimetrik.v_p.models.PgUserInfoMstr;


import com.altimetrik.v-p.exception.NotFoundException;
import java.util.List;

public interface PgUserInfoMstrApiService {
  
      List<PgUserInfoMstr> findAllPgUserInfoMstr()
      throws NotFoundException;
  
      PgUserInfoMstr updatePgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException;
  
      PgUserInfoMstr addPgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException;
  
      PgUserInfoMstr findByIdPgUserInfoMstr(Long id)
      throws NotFoundException;
  
      void deletePgUserInfoMstr(Long id)
      throws NotFoundException;
  
}

