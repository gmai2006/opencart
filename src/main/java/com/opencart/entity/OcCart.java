
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
@Table(name="oc_cart")
public class OcCart  {
  @Id
  @Column(name="\"cart_id\"" , length=10)
  @NotNull
  private Integer cart_id;

  @Basic
  @Column(name="\"api_id\"" , length=10)
  @NotNull
  private Integer api_id;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"session_id\"" , length=32)
  @NotNull
  private String session_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurring_id;

  @Basic
  @Column(name="\"option\"" , length=65535)
  @NotNull
  private String option;

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcCart() {
  }

  public void setCartId( Integer value) {
    this.cart_id = value;
  }
  public Integer getCartId() {
    return this.cart_id;
  }
  public void setApiId( Integer value) {
    this.api_id = value;
  }
  public Integer getApiId() {
    return this.api_id;
  }
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setSessionId( String value) {
    this.session_id = value;
  }
  public String getSessionId() {
    return this.session_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setRecurringId( Integer value) {
    this.recurring_id = value;
  }
  public Integer getRecurringId() {
    return this.recurring_id;
  }
  public void setOption( String value) {
    this.option = value;
  }
  public String getOption() {
    return this.option;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.cart_id)); 
     builder.append(String.valueOf(this.api_id)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.session_id)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.recurring_id)); 
     builder.append(String.valueOf(this.option)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}