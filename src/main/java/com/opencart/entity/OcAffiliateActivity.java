
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
@Table(name="oc_affiliate_activity")
public class OcAffiliateActivity  {
  @Id
  @Column(name="\"affiliate_activity_id\"" , length=10)
  @NotNull
  private Integer affiliate_activity_id;

  @Basic
  @Column(name="\"affiliate_id\"" , length=10)
  @NotNull
  private Integer affiliate_id;

  @Basic
  @Column(name="\"key\"" , length=64)
  @NotNull
  private String key;

  @Basic
  @Column(name="\"data\"" , length=65535)
  @NotNull
  private String data;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcAffiliateActivity() {
  }

  public void setAffiliateActivityId( Integer value) {
    this.affiliate_activity_id = value;
  }
  public Integer getAffiliateActivityId() {
    return this.affiliate_activity_id;
  }
  public void setAffiliateId( Integer value) {
    this.affiliate_id = value;
  }
  public Integer getAffiliateId() {
    return this.affiliate_id;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }
  public void setData( String value) {
    this.data = value;
  }
  public String getData() {
    return this.data;
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

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.affiliate_activity_id)); 
     builder.append(String.valueOf(this.affiliate_id)); 
     builder.append(String.valueOf(this.key)); 
     builder.append(String.valueOf(this.data)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}