
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
@Table(name="oc_marketing")
public class OcMarketing  {
  @Id
  @Column(name="\"marketing_id\"" , length=10)
  @NotNull
  private Integer marketing_id;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="\"code\"" , length=64)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"clicks\"" , length=10)
  @NotNull
  private Integer clicks;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcMarketing() {
  }

  public void setMarketingId( Integer value) {
    this.marketing_id = value;
  }
  public Integer getMarketingId() {
    return this.marketing_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setClicks( Integer value) {
    this.clicks = value;
  }
  public Integer getClicks() {
    return this.clicks;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.marketing_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.clicks)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}