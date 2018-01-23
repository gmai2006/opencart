
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
@Table(name="oc_return")
public class OcReturn  {
  @Id
  @Column(name="\"return_id\"" , length=10)
  @NotNull
  private Integer return_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="\"email\"" , length=96)
  @NotNull
  private String email;

  @Basic
  @Column(name="\"telephone\"" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="\"product\"" , length=255)
  @NotNull
  private String product;

  @Basic
  @Column(name="\"model\"" , length=64)
  @NotNull
  private String model;

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"opened\"" )
  @NotNull
  private Boolean opened;

  @Basic
  @Column(name="\"return_reason_id\"" , length=10)
  @NotNull
  private Integer return_reason_id;

  @Basic
  @Column(name="\"return_action_id\"" , length=10)
  @NotNull
  private Integer return_action_id;

  @Basic
  @Column(name="\"return_status_id\"" , length=10)
  @NotNull
  private Integer return_status_id;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  private String comment;

  @Basic
  @Column(name="\"date_ordered\"" , length=10)
  @NotNull
  private java.util.Date date_ordered = new java.util.Date();

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcReturn() {
  }

  public void setReturnId( Integer value) {
    this.return_id = value;
  }
  public Integer getReturnId() {
    return this.return_id;
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
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setProduct( String value) {
    this.product = value;
  }
  public String getProduct() {
    return this.product;
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
  public void setOpened( Boolean value) {
    this.opened = value;
  }
  public Boolean getOpened() {
    return this.opened;
  }
  public void setReturnReasonId( Integer value) {
    this.return_reason_id = value;
  }
  public Integer getReturnReasonId() {
    return this.return_reason_id;
  }
  public void setReturnActionId( Integer value) {
    this.return_action_id = value;
  }
  public Integer getReturnActionId() {
    return this.return_action_id;
  }
  public void setReturnStatusId( Integer value) {
    this.return_status_id = value;
  }
  public Integer getReturnStatusId() {
    return this.return_status_id;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setDateOrdered( java.util.Date value) {
    this.date_ordered = value;
  }
  public java.util.Date getDateOrdered() {
    return this.date_ordered;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.date_modified;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.return_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.email)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.product)); 
     builder.append(String.valueOf(this.model)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.opened)); 
     builder.append(String.valueOf(this.return_reason_id)); 
     builder.append(String.valueOf(this.return_action_id)); 
     builder.append(String.valueOf(this.return_status_id)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.date_ordered)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}