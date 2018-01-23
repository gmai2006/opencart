
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
@Table(name="oc_order_recurring")
public class OcOrderRecurring  {
  @Id
  @Column(name="\"order_recurring_id\"" , length=10)
  @NotNull
  private Integer order_recurring_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"reference\"" , length=255)
  @NotNull
  private String reference;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"product_name\"" , length=255)
  @NotNull
  private String product_name;

  @Basic
  @Column(name="\"product_quantity\"" , length=10)
  @NotNull
  private Integer product_quantity;

  @Basic
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurring_id;

  @Basic
  @Column(name="\"recurring_name\"" , length=255)
  @NotNull
  private String recurring_name;

  @Basic
  @Column(name="\"recurring_description\"" , length=255)
  @NotNull
  private String recurring_description;

  @Basic
  @Column(name="\"recurring_frequency\"" , length=25)
  @NotNull
  private String recurring_frequency;

  @Basic
  @Column(name="\"recurring_cycle\"" , length=5)
  @NotNull
  private Short recurring_cycle;

  @Basic
  @Column(name="\"recurring_duration\"" , length=5)
  @NotNull
  private Short recurring_duration;

  @Basic
  @Column(name="\"recurring_price\"" , length=10)
  @NotNull
  private java.math.BigDecimal recurring_price;

  @Basic
  @Column(name="\"trial\"" )
  @NotNull
  private Boolean trial;

  @Basic
  @Column(name="\"trial_frequency\"" , length=25)
  @NotNull
  private String trial_frequency;

  @Basic
  @Column(name="\"trial_cycle\"" , length=5)
  @NotNull
  private Short trial_cycle;

  @Basic
  @Column(name="\"trial_duration\"" , length=5)
  @NotNull
  private Short trial_duration;

  @Basic
  @Column(name="\"trial_price\"" , length=10)
  @NotNull
  private java.math.BigDecimal trial_price;

  @Basic
  @Column(name="\"status\"" , length=3)
  @NotNull
  private Byte status;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcOrderRecurring() {
  }

  public void setOrderRecurringId( Integer value) {
    this.order_recurring_id = value;
  }
  public Integer getOrderRecurringId() {
    return this.order_recurring_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setProductName( String value) {
    this.product_name = value;
  }
  public String getProductName() {
    return this.product_name;
  }
  public void setProductQuantity( Integer value) {
    this.product_quantity = value;
  }
  public Integer getProductQuantity() {
    return this.product_quantity;
  }
  public void setRecurringId( Integer value) {
    this.recurring_id = value;
  }
  public Integer getRecurringId() {
    return this.recurring_id;
  }
  public void setRecurringName( String value) {
    this.recurring_name = value;
  }
  public String getRecurringName() {
    return this.recurring_name;
  }
  public void setRecurringDescription( String value) {
    this.recurring_description = value;
  }
  public String getRecurringDescription() {
    return this.recurring_description;
  }
  public void setRecurringFrequency( String value) {
    this.recurring_frequency = value;
  }
  public String getRecurringFrequency() {
    return this.recurring_frequency;
  }
  public void setRecurringCycle( Short value) {
    this.recurring_cycle = value;
  }
  public Short getRecurringCycle() {
    return this.recurring_cycle;
  }
  public void setRecurringDuration( Short value) {
    this.recurring_duration = value;
  }
  public Short getRecurringDuration() {
    return this.recurring_duration;
  }
  public void setRecurringPrice( java.math.BigDecimal value) {
    this.recurring_price = value;
  }
  public java.math.BigDecimal getRecurringPrice() {
    return this.recurring_price;
  }
  public void setTrial( Boolean value) {
    this.trial = value;
  }
  public Boolean getTrial() {
    return this.trial;
  }
  public void setTrialFrequency( String value) {
    this.trial_frequency = value;
  }
  public String getTrialFrequency() {
    return this.trial_frequency;
  }
  public void setTrialCycle( Short value) {
    this.trial_cycle = value;
  }
  public Short getTrialCycle() {
    return this.trial_cycle;
  }
  public void setTrialDuration( Short value) {
    this.trial_duration = value;
  }
  public Short getTrialDuration() {
    return this.trial_duration;
  }
  public void setTrialPrice( java.math.BigDecimal value) {
    this.trial_price = value;
  }
  public java.math.BigDecimal getTrialPrice() {
    return this.trial_price;
  }
  public void setStatus( Byte value) {
    this.status = value;
  }
  public Byte getStatus() {
    return this.status;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.order_recurring_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.reference)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.product_name)); 
     builder.append(String.valueOf(this.product_quantity)); 
     builder.append(String.valueOf(this.recurring_id)); 
     builder.append(String.valueOf(this.recurring_name)); 
     builder.append(String.valueOf(this.recurring_description)); 
     builder.append(String.valueOf(this.recurring_frequency)); 
     builder.append(String.valueOf(this.recurring_cycle)); 
     builder.append(String.valueOf(this.recurring_duration)); 
     builder.append(String.valueOf(this.recurring_price)); 
     builder.append(String.valueOf(this.trial)); 
     builder.append(String.valueOf(this.trial_frequency)); 
     builder.append(String.valueOf(this.trial_cycle)); 
     builder.append(String.valueOf(this.trial_duration)); 
     builder.append(String.valueOf(this.trial_price)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}