
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
@Table(name="oc_return_history")
public class OcReturnHistory  {
  @Id
  @Column(name="\"return_history_id\"" , length=10)
  @NotNull
  private Integer return_history_id;

  @Basic
  @Column(name="\"return_id\"" , length=10)
  @NotNull
  private Integer return_id;

  @Basic
  @Column(name="\"return_status_id\"" , length=10)
  @NotNull
  private Integer return_status_id;

  @Basic
  @Column(name="\"notify\"" )
  @NotNull
  private Boolean notify;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcReturnHistory() {
  }

  public void setReturnHistoryId( Integer value) {
    this.return_history_id = value;
  }
  public Integer getReturnHistoryId() {
    return this.return_history_id;
  }
  public void setReturnId( Integer value) {
    this.return_id = value;
  }
  public Integer getReturnId() {
    return this.return_id;
  }
  public void setReturnStatusId( Integer value) {
    this.return_status_id = value;
  }
  public Integer getReturnStatusId() {
    return this.return_status_id;
  }
  public void setNotify( Boolean value) {
    this.notify = value;
  }
  public Boolean getNotify() {
    return this.notify;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.return_history_id)); 
     builder.append(String.valueOf(this.return_id)); 
     builder.append(String.valueOf(this.return_status_id)); 
     builder.append(String.valueOf(this.notify)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}