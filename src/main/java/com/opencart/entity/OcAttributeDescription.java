
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
@Table(name="oc_attribute_description")
@IdClass(value=OcAttributeDescriptionId.class)
public class OcAttributeDescription  {
  @Id
  @Column(name="\"attribute_id\"" , length=10)
  @NotNull
  private Integer attribute_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  public OcAttributeDescription() {
  }

  public void setAttributeId( Integer value) {
    this.attribute_id = value;
  }
  public Integer getAttributeId() {
    return this.attribute_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attribute_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}