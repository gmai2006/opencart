
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
@Table(name="oc_customer_group_description")
@IdClass(value=OcCustomerGroupDescriptionId.class)
public class OcCustomerGroupDescription  {
  @Id
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customer_group_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  public OcCustomerGroupDescription() {
  }

  public void setCustomerGroupId( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getCustomerGroupId() {
    return this.customer_group_id;
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
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customer_group_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); ;
    return builder.toString();
  }
}