package com.altimetrik.v_p.models;

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

public class PgSkillTrackMstr  {
  
  
   
  
  @Id
   
  
  private Long skillTrackMstrId = null;
  
   
   
  
  private String skillTrackName = null;
  
   
   
  
  private String description = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getSkillTrackMstrId() {
    return skillTrackMstrId;
  }
  public void setSkillTrackMstrId(Long skillTrackMstrId) {
    this.skillTrackMstrId = skillTrackMstrId;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgSkillTrackMstr pgSkillTrackMstr = (PgSkillTrackMstr) o;
    return Objects.equals(skillTrackMstrId, pgSkillTrackMstr.skillTrackMstrId) &&
        Objects.equals(skillTrackName, pgSkillTrackMstr.skillTrackName) &&
        Objects.equals(description, pgSkillTrackMstr.description) &&
        Objects.equals(createdDt, pgSkillTrackMstr.createdDt) &&
        Objects.equals(updatedDt, pgSkillTrackMstr.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillTrackMstrId, skillTrackName, description, createdDt, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgSkillTrackMstr {\n");
    
    sb.append("  skillTrackMstrId: ").append(skillTrackMstrId).append("\n");
    sb.append("  skillTrackName: ").append(skillTrackName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

