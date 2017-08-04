package com.altimetrik.v_p.models;

import com.altimetrik.v_p.models.PgSkillTrackDtls;
import com.altimetrik.v_p.models.PgRoleMstr;
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

public class PgUserInfoMstr  {
  
  
   
  
  @Id
   
  
  private Long userInfoMstrId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "ROLE_ID", insertable=false, updatable=false) 
  
  private PgRoleMstr pgRoleMstr = null;
  
   
   
  
  private String firstNm = null;
  
   
   
  
  private String lastNm = null;
  
   
   
  
  private String fullName = null;
  
   
   
  
  private String emailId = null;
  
   
   
  
  private String alternateEmailId = null;
  
   
   
  
  private String authAttribute = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "SKILL_TRACK_DTLS_ID", insertable=false, updatable=false) 
  
  private PgSkillTrackDtls pgSkillTrackDtls = null;
  
   
   
  
  private Integer employeeNo = null;
  
   
   
  
  private Long mobileNo = null;
  
   
   
  
  private Long phoneNo = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getUserInfoMstrId() {
    return userInfoMstrId;
  }
  public void setUserInfoMstrId(Long userInfoMstrId) {
    this.userInfoMstrId = userInfoMstrId;
  }

  
  /**
   * {"foreignKeyColumn":"ROLE_ID","relation":"OneToOne"}
   **/
  public PgRoleMstr getPgRoleMstr() {
    return pgRoleMstr;
  }
  public void setPgRoleMstr(PgRoleMstr pgRoleMstr) {
    this.pgRoleMstr = pgRoleMstr;
  }

  
  /**
   * {}
   **/
  public String getFirstNm() {
    return firstNm;
  }
  public void setFirstNm(String firstNm) {
    this.firstNm = firstNm;
  }

  
  /**
   * {}
   **/
  public String getLastNm() {
    return lastNm;
  }
  public void setLastNm(String lastNm) {
    this.lastNm = lastNm;
  }

  
  /**
   * {}
   **/
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   * {}
   **/
  public String getEmailId() {
    return emailId;
  }
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  
  /**
   * {}
   **/
  public String getAlternateEmailId() {
    return alternateEmailId;
  }
  public void setAlternateEmailId(String alternateEmailId) {
    this.alternateEmailId = alternateEmailId;
  }

  
  /**
   * {}
   **/
  public String getAuthAttribute() {
    return authAttribute;
  }
  public void setAuthAttribute(String authAttribute) {
    this.authAttribute = authAttribute;
  }

  
  /**
   * {"foreignKeyColumn":"SKILL_TRACK_DTLS_ID","relation":"OneToOne"}
   **/
  public PgSkillTrackDtls getPgSkillTrackDtls() {
    return pgSkillTrackDtls;
  }
  public void setPgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls) {
    this.pgSkillTrackDtls = pgSkillTrackDtls;
  }

  
  /**
   * {}
   **/
  public Integer getEmployeeNo() {
    return employeeNo;
  }
  public void setEmployeeNo(Integer employeeNo) {
    this.employeeNo = employeeNo;
  }

  
  /**
   * {}
   **/
  public Long getMobileNo() {
    return mobileNo;
  }
  public void setMobileNo(Long mobileNo) {
    this.mobileNo = mobileNo;
  }

  
  /**
   * {}
   **/
  public Long getPhoneNo() {
    return phoneNo;
  }
  public void setPhoneNo(Long phoneNo) {
    this.phoneNo = phoneNo;
  }

  
  /**
   * {}
   **/
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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
  public String getUpdatedBy() {
    return updatedBy;
  }
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
    PgUserInfoMstr pgUserInfoMstr = (PgUserInfoMstr) o;
    return Objects.equals(userInfoMstrId, pgUserInfoMstr.userInfoMstrId) &&
        Objects.equals(pgRoleMstr, pgUserInfoMstr.pgRoleMstr) &&
        Objects.equals(firstNm, pgUserInfoMstr.firstNm) &&
        Objects.equals(lastNm, pgUserInfoMstr.lastNm) &&
        Objects.equals(fullName, pgUserInfoMstr.fullName) &&
        Objects.equals(emailId, pgUserInfoMstr.emailId) &&
        Objects.equals(alternateEmailId, pgUserInfoMstr.alternateEmailId) &&
        Objects.equals(authAttribute, pgUserInfoMstr.authAttribute) &&
        Objects.equals(pgSkillTrackDtls, pgUserInfoMstr.pgSkillTrackDtls) &&
        Objects.equals(employeeNo, pgUserInfoMstr.employeeNo) &&
        Objects.equals(mobileNo, pgUserInfoMstr.mobileNo) &&
        Objects.equals(phoneNo, pgUserInfoMstr.phoneNo) &&
        Objects.equals(createdBy, pgUserInfoMstr.createdBy) &&
        Objects.equals(createdDt, pgUserInfoMstr.createdDt) &&
        Objects.equals(updatedBy, pgUserInfoMstr.updatedBy) &&
        Objects.equals(updatedDt, pgUserInfoMstr.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInfoMstrId, pgRoleMstr, firstNm, lastNm, fullName, emailId, alternateEmailId, authAttribute, pgSkillTrackDtls, employeeNo, mobileNo, phoneNo, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgUserInfoMstr {\n");
    
    sb.append("  userInfoMstrId: ").append(userInfoMstrId).append("\n");
    sb.append("  pgRoleMstr: ").append(pgRoleMstr).append("\n");
    sb.append("  firstNm: ").append(firstNm).append("\n");
    sb.append("  lastNm: ").append(lastNm).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  emailId: ").append(emailId).append("\n");
    sb.append("  alternateEmailId: ").append(alternateEmailId).append("\n");
    sb.append("  authAttribute: ").append(authAttribute).append("\n");
    sb.append("  pgSkillTrackDtls: ").append(pgSkillTrackDtls).append("\n");
    sb.append("  employeeNo: ").append(employeeNo).append("\n");
    sb.append("  mobileNo: ").append(mobileNo).append("\n");
    sb.append("  phoneNo: ").append(phoneNo).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

