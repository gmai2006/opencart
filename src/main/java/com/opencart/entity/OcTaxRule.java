
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
@Table(name="oc_tax_rule")
public class OcTaxRule  {
  @Id
  @Column(name="\"tax_rule_id\"" , length=10)
  @NotNull
  private Integer tax_rule_id;

  @Basic
  @Column(name="\"tax_class_id\"" , length=10)
  @NotNull
  private Integer tax_class_id;

  @Basic
  @Column(name="\"tax_rate_id\"" , length=10)
  @NotNull
  private Integer tax_rate_id;

  @Basic
  @Column(name="\"based\"" , length=10)
  @NotNull
  private String based;

  @Basic
  @Column(name="\"priority\"" , length=10)
  @NotNull
  private Integer priority = 1;

  public OcTaxRule() {
  }

  public void setTaxRuleId( Integer value) {
    this.tax_rule_id = value;
  }
  public Integer getTaxRuleId() {
    return this.tax_rule_id;
  }
  public void setTaxClassId( Integer value) {
    this.tax_class_id = value;
  }
  public Integer getTaxClassId() {
    return this.tax_class_id;
  }
  public void setTaxRateId( Integer value) {
    this.tax_rate_id = value;
  }
  public Integer getTaxRateId() {
    return this.tax_rate_id;
  }
  public void setBased( String value) {
    this.based = value;
  }
  public String getBased() {
    return this.based;
  }
  public void setPriority( Integer value) {
    this.priority = value;
  }
  public Integer getPriority() {
    return this.priority;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.tax_rule_id)); 
     builder.append(String.valueOf(this.tax_class_id)); 
     builder.append(String.valueOf(this.tax_rate_id)); 
     builder.append(String.valueOf(this.based)); 
     builder.append(String.valueOf(this.priority)); ;
    return builder.toString();
  }
}