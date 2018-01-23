
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
@Table(name="oc_custom_field")
public class OcCustomField  {
  @Id
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer custom_field_id;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="\"validation\"" , length=255)
  @NotNull
  private String validation;

  @Basic
  @Column(name="\"location\"" , length=7)
  @NotNull
  private String location;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcCustomField() {
  }

  public void setCustomFieldId( Integer value) {
    this.custom_field_id = value;
  }
  public Integer getCustomFieldId() {
    return this.custom_field_id;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setValidation( String value) {
    this.validation = value;
  }
  public String getValidation() {
    return this.validation;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.custom_field_id)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.validation)); 
     builder.append(String.valueOf(this.location)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}