
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
@Table(name="oc_manufacturer")
public class OcManufacturer  {
  @Id
  @Column(name="\"manufacturer_id\"" , length=10)
  @NotNull
  private Integer manufacturer_id;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"image\"" , length=255)
  private String image;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcManufacturer() {
  }

  public void setManufacturerId( Integer value) {
    this.manufacturer_id = value;
  }
  public Integer getManufacturerId() {
    return this.manufacturer_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.manufacturer_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}