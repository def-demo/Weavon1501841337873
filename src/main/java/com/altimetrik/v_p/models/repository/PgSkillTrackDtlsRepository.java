package com.altimetrik.v_p.models.repository;

import com.altimetrik.v_p.models.*;

import com.altimetrik.v_p.models.PgSkillTrackMstr;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgSkillTrackDtlsRepository extends JpaRepository<PgSkillTrackDtls, Long>{

}



