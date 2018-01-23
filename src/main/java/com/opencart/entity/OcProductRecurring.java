
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
@Table(name="oc_product_recurring")
@IdClass(value=OcProductRecurringId.class)
public class OcProductRecurring  {
  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Id
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurring_id;

  @Id
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customer_group_id;

  public OcProductRecurring() {
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
  public void setCustomerGroupId( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getCustomerGroupId() {
    return this.customer_group_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.recurring_id)); 
     builder.append(String.valueOf(this.customer_group_id)); ;
    return builder.toString();
  }
}