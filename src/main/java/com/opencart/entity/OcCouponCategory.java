
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
@Table(name="oc_coupon_category")
@IdClass(value=OcCouponCategoryId.class)
public class OcCouponCategory  {
  @Id
  @Column(name="\"coupon_id\"" , length=10)
  @NotNull
  private Integer coupon_id;

  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer category_id;

  public OcCouponCategory() {
  }

  public void setCouponId( Integer value) {
    this.coupon_id = value;
  }
  public Integer getCouponId() {
    return this.coupon_id;
  }
  public void setCategoryId( Integer value) {
    this.category_id = value;
  }
  public Integer getCategoryId() {
    return this.category_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.coupon_id)); 
     builder.append(String.valueOf(this.category_id)); ;
    return builder.toString();
  }
}