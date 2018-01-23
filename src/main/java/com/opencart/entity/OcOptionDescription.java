
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
@Table(name="oc_option_description")
@IdClass(value=OcOptionDescriptionId.class)
public class OcOptionDescription  {
  @Id
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer option_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  public OcOptionDescription() {
  }

  public void setOptionId( Integer value) {
    this.option_id = value;
  }
  public Integer getOptionId() {
    return this.option_id;
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
     builder.append(String.valueOf(this.option_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}