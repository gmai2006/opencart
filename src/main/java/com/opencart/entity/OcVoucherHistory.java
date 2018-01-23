
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
@Table(name="oc_voucher_history")
public class OcVoucherHistory  {
  @Id
  @Column(name="\"voucher_history_id\"" , length=10)
  @NotNull
  private Integer voucher_history_id;

  @Basic
  @Column(name="\"voucher_id\"" , length=10)
  @NotNull
  private Integer voucher_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private java.math.BigDecimal amount;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcVoucherHistory() {
  }

  public void setVoucherHistoryId( Integer value) {
    this.voucher_history_id = value;
  }
  public Integer getVoucherHistoryId() {
    return this.voucher_history_id;
  }
  public void setVoucherId( Integer value) {
    this.voucher_id = value;
  }
  public Integer getVoucherId() {
    return this.voucher_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
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
     builder.append(String.valueOf(this.voucher_history_id)); 
     builder.append(String.valueOf(this.voucher_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}