
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
@Table(name="oc_information_to_layout")
@IdClass(value=OcInformationToLayoutId.class)
public class OcInformationToLayout  {
  @Id
  @Column(name="\"information_id\"" , length=10)
  @NotNull
  private Integer information_id;

  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layout_id;

  public OcInformationToLayout() {
  }

  public void setInformationId( Integer value) {
    this.information_id = value;
  }
  public Integer getInformationId() {
    return this.information_id;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setLayoutId( Integer value) {
    this.layout_id = value;
  }
  public Integer getLayoutId() {
    return this.layout_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.information_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.layout_id)); ;
    return builder.toString();
  }
}