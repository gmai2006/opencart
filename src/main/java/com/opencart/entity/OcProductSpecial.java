
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
@Table(name="oc_product_special")
public class OcProductSpecial  {
  @Id
  @Column(name="\"product_special_id\"" , length=10)
  @NotNull
  private Integer product_special_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customer_group_id;

  @Basic
  @Column(name="\"priority\"" , length=10)
  @NotNull
  private Integer priority = 1;

  @Basic
  @Column(name="\"price\"" , length=15)
  @NotNull
  private java.math.BigDecimal price = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"date_start\"" , length=10)
  @NotNull
  private java.util.Date date_start = new java.util.Date();

  @Basic
  @Column(name="\"date_end\"" , length=10)
  @NotNull
  private java.util.Date date_end = new java.util.Date();

  public OcProductSpecial() {
  }

  public void setProductSpecialId( Integer value) {
    this.product_special_id = value;
  }
  public Integer getProductSpecialId() {
    return this.product_special_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setCustomerGroupId( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getCustomerGroupId() {
    return this.customer_group_id;
  }
  public void setPriority( Integer value) {
    this.priority = value;
  }
  public Integer getPriority() {
    return this.priority;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setDateStart( java.util.Date value) {
    this.date_start = value;
  }
  public java.util.Date getDateStart() {
    return this.date_start;
  }
  public void setDateEnd( java.util.Date value) {
    this.date_end = value;
  }
  public java.util.Date getDateEnd() {
    return this.date_end;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_special_id)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.customer_group_id)); 
     builder.append(String.valueOf(this.priority)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.date_start)); 
     builder.append(String.valueOf(this.date_end)); ;
    return builder.toString();
  }
}