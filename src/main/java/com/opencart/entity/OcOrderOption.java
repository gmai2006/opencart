
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
@Table(name="oc_order_option")
public class OcOrderOption  {
  @Id
  @Column(name="\"order_option_id\"" , length=10)
  @NotNull
  private Integer order_option_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"order_product_id\"" , length=10)
  @NotNull
  private Integer order_product_id;

  @Basic
  @Column(name="\"product_option_id\"" , length=10)
  @NotNull
  private Integer product_option_id;

  @Basic
  @Column(name="\"product_option_value_id\"" , length=10)
  @NotNull
  private Integer product_option_value_id;

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

  public OcOrderOption() {
  }

  public void setOrderOptionId( Integer value) {
    this.order_option_id = value;
  }
  public Integer getOrderOptionId() {
    return this.order_option_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setOrderProductId( Integer value) {
    this.order_product_id = value;
  }
  public Integer getOrderProductId() {
    return this.order_product_id;
  }
  public void setProductOptionId( Integer value) {
    this.product_option_id = value;
  }
  public Integer getProductOptionId() {
    return this.product_option_id;
  }
  public void setProductOptionValueId( Integer value) {
    this.product_option_value_id = value;
  }
  public Integer getProductOptionValueId() {
    return this.product_option_value_id;
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

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.order_option_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.order_product_id)); 
     builder.append(String.valueOf(this.product_option_id)); 
     builder.append(String.valueOf(this.product_option_value_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.type)); ;
    return builder.toString();
  }
}