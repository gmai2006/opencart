
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
@Table(name="oc_order_recurring_transaction")
public class OcOrderRecurringTransaction  {
  @Id
  @Column(name="\"order_recurring_transaction_id\"" , length=10)
  @NotNull
  private Integer order_recurring_transaction_id;

  @Basic
  @Column(name="\"order_recurring_id\"" , length=10)
  @NotNull
  private Integer order_recurring_id;

  @Basic
  @Column(name="\"reference\"" , length=255)
  @NotNull
  private String reference;

  @Basic
  @Column(name="\"type\"" , length=255)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"amount\"" , length=10)
  @NotNull
  private java.math.BigDecimal amount;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcOrderRecurringTransaction() {
  }

  public void setOrderRecurringTransactionId( Integer value) {
    this.order_recurring_transaction_id = value;
  }
  public Integer getOrderRecurringTransactionId() {
    return this.order_recurring_transaction_id;
  }
  public void setOrderRecurringId( Integer value) {
    this.order_recurring_id = value;
  }
  public Integer getOrderRecurringId() {
    return this.order_recurring_id;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
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
     builder.append(String.valueOf(this.order_recurring_transaction_id)); 
     builder.append(String.valueOf(this.order_recurring_id)); 
     builder.append(String.valueOf(this.reference)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}