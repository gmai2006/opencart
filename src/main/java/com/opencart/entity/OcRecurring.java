
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
@Table(name="oc_recurring")
public class OcRecurring  {
  @Id
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurring_id;

  @Basic
  @Column(name="\"price\"" , length=10)
  @NotNull
  private java.math.BigDecimal price;

  @Basic
  @Column(name="\"frequency\"" , length=10)
  @NotNull
  private String frequency;

  @Basic
  @Column(name="\"duration\"" , length=10)
  @NotNull
  private Integer duration;

  @Basic
  @Column(name="\"cycle\"" , length=10)
  @NotNull
  private Integer cycle;

  @Basic
  @Column(name="\"trial_status\"" , length=3)
  @NotNull
  private Byte trial_status;

  @Basic
  @Column(name="\"trial_price\"" , length=10)
  @NotNull
  private java.math.BigDecimal trial_price;

  @Basic
  @Column(name="\"trial_frequency\"" , length=10)
  @NotNull
  private String trial_frequency;

  @Basic
  @Column(name="\"trial_duration\"" , length=10)
  @NotNull
  private Integer trial_duration;

  @Basic
  @Column(name="\"trial_cycle\"" , length=10)
  @NotNull
  private Integer trial_cycle;

  @Basic
  @Column(name="\"status\"" , length=3)
  @NotNull
  private Byte status;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcRecurring() {
  }

  public void setRecurringId( Integer value) {
    this.recurring_id = value;
  }
  public Integer getRecurringId() {
    return this.recurring_id;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setFrequency( String value) {
    this.frequency = value;
  }
  public String getFrequency() {
    return this.frequency;
  }
  public void setDuration( Integer value) {
    this.duration = value;
  }
  public Integer getDuration() {
    return this.duration;
  }
  public void setCycle( Integer value) {
    this.cycle = value;
  }
  public Integer getCycle() {
    return this.cycle;
  }
  public void setTrialStatus( Byte value) {
    this.trial_status = value;
  }
  public Byte getTrialStatus() {
    return this.trial_status;
  }
  public void setTrialPrice( java.math.BigDecimal value) {
    this.trial_price = value;
  }
  public java.math.BigDecimal getTrialPrice() {
    return this.trial_price;
  }
  public void setTrialFrequency( String value) {
    this.trial_frequency = value;
  }
  public String getTrialFrequency() {
    return this.trial_frequency;
  }
  public void setTrialDuration( Integer value) {
    this.trial_duration = value;
  }
  public Integer getTrialDuration() {
    return this.trial_duration;
  }
  public void setTrialCycle( Integer value) {
    this.trial_cycle = value;
  }
  public Integer getTrialCycle() {
    return this.trial_cycle;
  }
  public void setStatus( Byte value) {
    this.status = value;
  }
  public Byte getStatus() {
    return this.status;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.recurring_id)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.frequency)); 
     builder.append(String.valueOf(this.duration)); 
     builder.append(String.valueOf(this.cycle)); 
     builder.append(String.valueOf(this.trial_status)); 
     builder.append(String.valueOf(this.trial_price)); 
     builder.append(String.valueOf(this.trial_frequency)); 
     builder.append(String.valueOf(this.trial_duration)); 
     builder.append(String.valueOf(this.trial_cycle)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}