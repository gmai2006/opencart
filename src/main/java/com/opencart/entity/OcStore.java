
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
@Table(name="oc_store")
public class OcStore  {
  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"url\"" , length=255)
  @NotNull
  private String url;

  @Basic
  @Column(name="\"ssl\"" , length=255)
  @NotNull
  private String ssl;

  public OcStore() {
  }

  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setSsl( String value) {
    this.ssl = value;
  }
  public String getSsl() {
    return this.ssl;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.url)); 
     builder.append(String.valueOf(this.ssl)); ;
    return builder.toString();
  }
}