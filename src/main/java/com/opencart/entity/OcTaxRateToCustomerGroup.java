
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
@Table(name="oc_tax_rate_to_customer_group")
@IdClass(value=OcTaxRateToCustomerGroupId.class)
public class OcTaxRateToCustomerGroup  {
  @Id
  @Column(name="\"tax_rate_id\"" , length=10)
  @NotNull
  private Integer tax_rate_id;

  @Id
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customer_group_id;

  public OcTaxRateToCustomerGroup() {
  }

  public void setTaxRateId( Integer value) {
    this.tax_rate_id = value;
  }
  public Integer getTaxRateId() {
    return this.tax_rate_id;
  }
  public void setCustomerGroupId( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getCustomerGroupId() {
    return this.customer_group_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.tax_rate_id)); 
     builder.append(String.valueOf(this.customer_group_id)); ;
    return builder.toString();
  }
}