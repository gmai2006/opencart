
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
@Table(name="oc_coupon_product")
public class OcCouponProduct  {
  @Id
  @Column(name="\"coupon_product_id\"" , length=10)
  @NotNull
  private Integer coupon_product_id;

  @Basic
  @Column(name="\"coupon_id\"" , length=10)
  @NotNull
  private Integer coupon_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  public OcCouponProduct() {
  }

  public void setCouponProductId( Integer value) {
    this.coupon_product_id = value;
  }
  public Integer getCouponProductId() {
    return this.coupon_product_id;
  }
  public void setCouponId( Integer value) {
    this.coupon_id = value;
  }
  public Integer getCouponId() {
    return this.coupon_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.coupon_product_id)); 
     builder.append(String.valueOf(this.coupon_id)); 
     builder.append(String.valueOf(this.product_id)); ;
    return builder.toString();
  }
}