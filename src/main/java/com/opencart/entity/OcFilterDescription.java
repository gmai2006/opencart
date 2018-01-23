
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
@Table(name="oc_filter_description")
@IdClass(value=OcFilterDescriptionId.class)
public class OcFilterDescription  {
  @Id
  @Column(name="\"filter_id\"" , length=10)
  @NotNull
  private Integer filter_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"filter_group_id\"" , length=10)
  @NotNull
  private Integer filter_group_id;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  public OcFilterDescription() {
  }

  public void setFilterId( Integer value) {
    this.filter_id = value;
  }
  public Integer getFilterId() {
    return this.filter_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setFilterGroupId( Integer value) {
    this.filter_group_id = value;
  }
  public Integer getFilterGroupId() {
    return this.filter_group_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.filter_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.filter_group_id)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}