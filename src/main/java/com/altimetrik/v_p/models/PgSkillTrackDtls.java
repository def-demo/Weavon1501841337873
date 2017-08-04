package com.altimetrik.v_p.models;

import com.altimetrik.v_p.models.PgSkillTrackMstr;
import java.util.Date;

import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class PgSkillTrackDtls  {
  
  
   
  
  @Id
   
  
  private Long skillTrackDtlsId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "SKILL_TRACK_MSTR_ID", insertable=false, updatable=false) 
  
  private PgSkillTrackMstr pgSkillTrackMstr = null;
  
   
   
  
  private String description = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private Date updatedDt = null;
  
   
   
  
  private String skillTrackName = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getSkillTrackDtlsId() {
    return skillTrackDtlsId;
  }
  public void setSkillTrackDtlsId(Long skillTrackDtlsId) {
    this.skillTrackDtlsId = skillTrackDtlsId;
  }

  
  /**
   * {"foreignKeyColumn":"SKILL_TRACK_MSTR_ID","relation":"OneToOne"}
   **/
  public PgSkillTrackMstr getPgSkillTrackMstr() {
    return pgSkillTrackMstr;
  }
  public void setPgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr) {
    this.pgSkillTrackMstr = pgSkillTrackMstr;
  }

  
  /**
   * {}
   **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * {}
   **/
  public Date getCreatedDt() {
    return createdDt;
  }
  public void setCreatedDt(Date createdDt) {
    this.createdDt = createdDt;
  }

  
  /**
   * {}
   **/
  public Date getUpdatedDt() {
    return updatedDt;
  }
  public void setUpdatedDt(Date updatedDt) {
    this.updatedDt = updatedDt;
  }

  
  /**
   * {}
   **/
  public String getSkillTrackName() {
    return skillTrackName;
  }
  public void setSkillTrackName(String skillTrackName) {
    this.skillTrackName = skillTrackName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgSkillTrackDtls pgSkillTrackDtls = (PgSkillTrackDtls) o;
    return Objects.equals(skillTrackDtlsId, pgSkillTrackDtls.skillTrackDtlsId) &&
        Objects.equals(pgSkillTrackMstr, pgSkillTrackDtls.pgSkillTrackMstr) &&
        Objects.equals(description, pgSkillTrackDtls.description) &&
        Objects.equals(createdDt, pgSkillTrackDtls.createdDt) &&
        Objects.equals(updatedDt, pgSkillTrackDtls.updatedDt) &&
        Objects.equals(skillTrackName, pgSkillTrackDtls.skillTrackName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillTrackDtlsId, pgSkillTrackMstr, description, createdDt, updatedDt, skillTrackName);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgSkillTrackDtls {\n");
    
    sb.append("  skillTrackDtlsId: ").append(skillTrackDtlsId).append("\n");
    sb.append("  pgSkillTrackMstr: ").append(pgSkillTrackMstr).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("  skillTrackName: ").append(skillTrackName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

