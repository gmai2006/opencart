
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
@Table(name="oc_customer_transaction")
public class OcCustomerTransaction  {
  @Id
  @Column(name="\"customer_transaction_id\"" , length=10)
  @NotNull
  private Integer customer_transaction_id;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

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

  public OcCustomerTransaction() {
  }

  public void setCustomerTransactionId( Integer value) {
    this.customer_transaction_id = value;
  }
  public Integer getCustomerTransactionId() {
    return this.customer_transaction_id;
  }
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
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
     builder.append(String.valueOf(this.customer_transaction_id)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}