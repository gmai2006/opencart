
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
@Table(name="oc_custom_field_customer_group")
@IdClass(value=OcCustomFieldCustomerGroupId.class)
public class OcCustomFieldCustomerGroup  {
  @Id
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer custom_field_id;

  @Id
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customer_group_id;

  @Basic
  @Column(name="\"required\"" )
  @NotNull
  private Boolean required;

  public OcCustomFieldCustomerGroup() {
  }

  public void setCustomFieldId( Integer value) {
    this.custom_field_id = value;
  }
  public Integer getCustomFieldId() {
    return this.custom_field_id;
  }
  public void setCustomerGroupId( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getCustomerGroupId() {
    return this.customer_group_id;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRequired() {
    return this.required;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.custom_field_id)); 
     builder.append(String.valueOf(this.customer_group_id)); 
     builder.append(String.valueOf(this.required)); ;
    return builder.toString();
  }
}