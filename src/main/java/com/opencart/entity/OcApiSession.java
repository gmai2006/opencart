
package com.opencart.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_api_session")
public class OcApiSession  {
  @Id
  @Column(name="\"api_session_id\"" , length=10)
  @NotNull
  private Integer api_session_id;

  @Basic
  @Column(name="\"api_id\"" , length=10)
  @NotNull
  private Integer api_id;

  @Basic
  @Column(name="\"token\"" , length=32)
  @NotNull
  private String token;

  @Basic
  @Column(name="\"session_id\"" , length=32)
  @NotNull
  private String session_id;

  @Basic
  @Column(name="\"session_name\"" , length=32)
  @NotNull
  private String session_name;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcApiSession() {
  }

  public void setApiSessionId( Integer value) {
    this.api_session_id = value;
  }
  public Integer getApiSessionId() {
    return this.api_session_id;
  }
  public void setApiId( Integer value) {
    this.api_id = value;
  }
  public Integer getApiId() {
    return this.api_id;
  }
  public void setToken( String value) {
    this.token = value;
  }
  public String getToken() {
    return this.token;
  }
  public void setSessionId( String value) {
    this.session_id = value;
  }
  public String getSessionId() {
    return this.session_id;
  }
  public void setSessionName( String value) {
    this.session_name = value;
  }
  public String getSessionName() {
    return this.session_name;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.date_modified;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.api_session_id)); 
     builder.append(String.valueOf(this.api_id)); 
     builder.append(String.valueOf(this.token)); 
     builder.append(String.valueOf(this.session_id)); 
     builder.append(String.valueOf(this.session_name)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}