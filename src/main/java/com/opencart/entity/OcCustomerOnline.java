
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
@Table(name="oc_customer_online")
public class OcCustomerOnline  {
  @Id
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"url\"" , length=65535)
  @NotNull
  private String url;

  @Basic
  @Column(name="\"referer\"" , length=65535)
  @NotNull
  private String referer;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcCustomerOnline() {
  }

  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setReferer( String value) {
    this.referer = value;
  }
  public String getReferer() {
    return this.referer;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.url)); 
     builder.append(String.valueOf(this.referer)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}