
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
@Table(name="oc_zone")
public class OcZone  {
  @Id
  @Column(name="\"zone_id\"" , length=10)
  @NotNull
  private Integer zone_id;

  @Basic
  @Column(name="\"country_id\"" , length=10)
  @NotNull
  private Integer country_id;

  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status = true;

  public OcZone() {
  }

  public void setZoneId( Integer value) {
    this.zone_id = value;
  }
  public Integer getZoneId() {
    return this.zone_id;
  }
  public void setCountryId( Integer value) {
    this.country_id = value;
  }
  public Integer getCountryId() {
    return this.country_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.zone_id)); 
     builder.append(String.valueOf(this.country_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}