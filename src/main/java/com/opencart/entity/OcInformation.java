
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
@Table(name="oc_information")
public class OcInformation  {
  @Id
  @Column(name="\"information_id\"" , length=10)
  @NotNull
  private Integer information_id;

  @Basic
  @Column(name="\"bottom\"" , length=10)
  @NotNull
  private Integer bottom;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status = true;

  public OcInformation() {
  }

  public void setInformationId( Integer value) {
    this.information_id = value;
  }
  public Integer getInformationId() {
    return this.information_id;
  }
  public void setBottom( Integer value) {
    this.bottom = value;
  }
  public Integer getBottom() {
    return this.bottom;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.information_id)); 
     builder.append(String.valueOf(this.bottom)); 
     builder.append(String.valueOf(this.sort_order)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}