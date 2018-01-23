
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
@Table(name="oc_order_total")
public class OcOrderTotal  {
  @Id
  @Column(name="\"order_total_id\"" , length=10)
  @NotNull
  private Integer order_total_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"title\"" , length=255)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"value\"" , length=15)
  @NotNull
  private java.math.BigDecimal value = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcOrderTotal() {
  }

  public void setOrderTotalId( Integer value) {
    this.order_total_id = value;
  }
  public Integer getOrderTotalId() {
    return this.order_total_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setValue( java.math.BigDecimal value) {
    this.value = value;
  }
  public java.math.BigDecimal getValue() {
    return this.value;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.order_total_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}