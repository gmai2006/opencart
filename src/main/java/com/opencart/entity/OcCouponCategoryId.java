
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCouponCategoryId  implements Serializable  {
  @Column(name="category_id")
  private Integer category_id;

  @Column(name="coupon_id")
  private Integer coupon_id;

  public OcCouponCategoryId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.category_id = value;
    }

    public void setCouponId( Integer value) {
      this.coupon_id = value;
    }

    public Integer getCategoryId() {
      return this.category_id;
    }

    public Integer getCouponId() {
      return this.coupon_id;
    }

  @Override
  public int hashCode() {
      return category_id.hashCode()
      + coupon_id.hashCode();
  }

}