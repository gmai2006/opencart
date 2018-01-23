
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
@Table(name="oc_length_class_description")
@IdClass(value=OcLengthClassDescriptionId.class)
public class OcLengthClassDescription  {
  @Id
  @Column(name="\"length_class_id\"" , length=10)
  @NotNull
  private Integer length_class_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"title\"" , length=32)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"unit\"" , length=4)
  @NotNull
  private String unit;

  public OcLengthClassDescription() {
  }

  public void setLengthClassId( Integer value) {
    this.length_class_id = value;
  }
  public Integer getLengthClassId() {
    return this.length_class_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setUnit( String value) {
    this.unit = value;
  }
  public String getUnit() {
    return this.unit;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.length_class_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.unit)); ;
    return builder.toString();
  }
}