
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
@Table(name="oc_custom_field_value")
public class OcCustomFieldValue  {
  @Id
  @Column(name="\"custom_field_value_id\"" , length=10)
  @NotNull
  private Integer custom_field_value_id;

  @Basic
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer custom_field_id;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcCustomFieldValue() {
  }

  public void setCustomFieldValueId( Integer value) {
    this.custom_field_value_id = value;
  }
  public Integer getCustomFieldValueId() {
    return this.custom_field_value_id;
  }
  public void setCustomFieldId( Integer value) {
    this.custom_field_id = value;
  }
  public Integer getCustomFieldId() {
    return this.custom_field_id;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.custom_field_value_id)); 
     builder.append(String.valueOf(this.custom_field_id)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}