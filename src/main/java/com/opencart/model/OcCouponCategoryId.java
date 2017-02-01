package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCouponCategoryId  implements Serializable  {
  @Column(name="category_id")
  private OcCouponCategoryId categoryId;

  @Column(name="coupon_id")
  private OcCouponCategoryId couponId;

  public OcCouponCategoryId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( OcCouponCategoryId value) {
      this.categoryId = value;
    }

    public void setCouponId( OcCouponCategoryId value) {
      this.couponId = value;
    }

    public OcCouponCategoryId getCategoryId() {
      return this.categoryId;
    }

    public OcCouponCategoryId getCouponId() {
      return this.couponId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + couponId.hashCode();
  }

}