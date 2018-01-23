
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
@Table(name="oc_order_product")
public class OcOrderProduct  {
  @Id
  @Column(name="\"order_product_id\"" , length=10)
  @NotNull
  private Integer order_product_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"model\"" , length=64)
  @NotNull
  private String model;

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"price\"" , length=15)
  @NotNull
  private java.math.BigDecimal price = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"total\"" , length=15)
  @NotNull
  private java.math.BigDecimal total = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"tax\"" , length=15)
  @NotNull
  private java.math.BigDecimal tax = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"reward\"" , length=10)
  @NotNull
  private Integer reward;

  public OcOrderProduct() {
  }

  public void setOrderProductId( Integer value) {
    this.order_product_id = value;
  }
  public Integer getOrderProductId() {
    return this.order_product_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setTotal( java.math.BigDecimal value) {
    this.total = value;
  }
  public java.math.BigDecimal getTotal() {
    return this.total;
  }
  public void setTax( java.math.BigDecimal value) {
    this.tax = value;
  }
  public java.math.BigDecimal getTax() {
    return this.tax;
  }
  public void setReward( Integer value) {
    this.reward = value;
  }
  public Integer getReward() {
    return this.reward;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.order_product_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.model)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.tax)); 
     builder.append(String.valueOf(this.reward)); ;
    return builder.toString();
  }
}