
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
@Table(name="oc_product_option")
public class OcProductOption  {
  @Id
  @Column(name="\"product_option_id\"" , length=10)
  @NotNull
  private Integer product_option_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer option_id;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="\"required\"" )
  @NotNull
  private Boolean required;

  public OcProductOption() {
  }

  public void setProductOptionId( Integer value) {
    this.product_option_id = value;
  }
  public Integer getProductOptionId() {
    return this.product_option_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setOptionId( Integer value) {
    this.option_id = value;
  }
  public Integer getOptionId() {
    return this.option_id;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRequired() {
    return this.required;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_option_id)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.option_id)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.required)); ;
    return builder.toString();
  }
}