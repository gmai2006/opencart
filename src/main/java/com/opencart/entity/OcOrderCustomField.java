
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
@Table(name="oc_order_custom_field")
public class OcOrderCustomField  {
  @Id
  @Column(name="\"order_custom_field_id\"" , length=10)
  @NotNull
  private Integer order_custom_field_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer custom_field_id;

  @Basic
  @Column(name="\"custom_field_value_id\"" , length=10)
  @NotNull
  private Integer custom_field_value_id;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"location\"" , length=16)
  @NotNull
  private String location;

  public OcOrderCustomField() {
  }

  public void setOrderCustomFieldId( Integer value) {
    this.order_custom_field_id = value;
  }
  public Integer getOrderCustomFieldId() {
    return this.order_custom_field_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setCustomFieldId( Integer value) {
    this.custom_field_id = value;
  }
  public Integer getCustomFieldId() {
    return this.custom_field_id;
  }
  public void setCustomFieldValueId( Integer value) {
    this.custom_field_value_id = value;
  }
  public Integer getCustomFieldValueId() {
    return this.custom_field_value_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.order_custom_field_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.custom_field_id)); 
     builder.append(String.valueOf(this.custom_field_value_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.location)); ;
    return builder.toString();
  }
}