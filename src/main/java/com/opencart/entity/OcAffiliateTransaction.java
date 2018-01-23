
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
@Table(name="oc_affiliate_transaction")
public class OcAffiliateTransaction  {
  @Id
  @Column(name="\"affiliate_transaction_id\"" , length=10)
  @NotNull
  private Integer affiliate_transaction_id;

  @Basic
  @Column(name="\"affiliate_id\"" , length=10)
  @NotNull
  private Integer affiliate_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private java.math.BigDecimal amount;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcAffiliateTransaction() {
  }

  public void setAffiliateTransactionId( Integer value) {
    this.affiliate_transaction_id = value;
  }
  public Integer getAffiliateTransactionId() {
    return this.affiliate_transaction_id;
  }
  public void setAffiliateId( Integer value) {
    this.affiliate_id = value;
  }
  public Integer getAffiliateId() {
    return this.affiliate_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
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
     builder.append(String.valueOf(this.affiliate_transaction_id)); 
     builder.append(String.valueOf(this.affiliate_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}