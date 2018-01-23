
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
@Table(name="oc_coupon_history")
public class OcCouponHistory  {
  @Id
  @Column(name="\"coupon_history_id\"" , length=10)
  @NotNull
  private Integer coupon_history_id;

  @Basic
  @Column(name="\"coupon_id\"" , length=10)
  @NotNull
  private Integer coupon_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private java.math.BigDecimal amount;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcCouponHistory() {
  }

  public void setCouponHistoryId( Integer value) {
    this.coupon_history_id = value;
  }
  public Integer getCouponHistoryId() {
    return this.coupon_history_id;
  }
  public void setCouponId( Integer value) {
    this.coupon_id = value;
  }
  public Integer getCouponId() {
    return this.coupon_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setAmount( java.math.BigDecimal value) {
    this.amount = value;
  }
  public java.math.BigDecimal getAmount() {
    return this.amount;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.coupon_history_id)); 
     builder.append(String.valueOf(this.coupon_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}