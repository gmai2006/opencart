
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
@Table(name="oc_length_class")
public class OcLengthClass  {
  @Id
  @Column(name="\"length_class_id\"" , length=10)
  @NotNull
  private Integer length_class_id;

  @Basic
  @Column(name="\"value\"" , length=15)
  @NotNull
  private java.math.BigDecimal value;

  public OcLengthClass() {
  }

  public void setLengthClassId( Integer value) {
    this.length_class_id = value;
  }
  public Integer getLengthClassId() {
    return this.length_class_id;
  }
  public void setValue( java.math.BigDecimal value) {
    this.value = value;
  }
  public java.math.BigDecimal getValue() {
    return this.value;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.length_class_id)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}