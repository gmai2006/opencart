
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
@Table(name="oc_information_to_store")
@IdClass(value=OcInformationToStoreId.class)
public class OcInformationToStore  {
  @Id
  @Column(name="\"information_id\"" , length=10)
  @NotNull
  private Integer information_id;

  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  public OcInformationToStore() {
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

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.information_id)); 
     builder.append(String.valueOf(this.store_id)); ;
    return builder.toString();
  }
}