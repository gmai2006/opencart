
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
@Table(name="oc_event")
public class OcEvent  {
  @Id
  @Column(name="\"event_id\"" , length=10)
  @NotNull
  private Integer event_id;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"trigger\"" , length=65535)
  @NotNull
  private String trigger;

  @Basic
  @Column(name="\"action\"" , length=65535)
  @NotNull
  private String action;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcEvent() {
  }

  public void setEventId( Integer value) {
    this.event_id = value;
  }
  public Integer getEventId() {
    return this.event_id;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setTrigger( String value) {
    this.trigger = value;
  }
  public String getTrigger() {
    return this.trigger;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.event_id)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.trigger)); 
     builder.append(String.valueOf(this.action)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}