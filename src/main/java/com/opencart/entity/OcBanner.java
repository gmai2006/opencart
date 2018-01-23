
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
@Table(name="oc_banner")
public class OcBanner  {
  @Id
  @Column(name="\"banner_id\"" , length=10)
  @NotNull
  private Integer banner_id;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcBanner() {
  }

  public void setBannerId( Integer value) {
    this.banner_id = value;
  }
  public Integer getBannerId() {
    return this.banner_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.banner_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}