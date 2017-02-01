package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_coupon_category")
@IdClass(value=OcCouponCategoryId.class)
public class OcCouponCategory  {
  @Id
  @Column(name="coupon_id" , length=10)
  @NotNull
  private Integer couponId;

  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  public OcCouponCategory() {
  }

  public void setCouponId( Integer value) {
    this.couponId = value;
  }
  public Integer getCouponId() {
    return this.couponId;
  }
  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }

  public String toJson() {
      OcCouponCategory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCouponCategory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCouponCategory.class);
    }

  public static OcCouponCategory fromArray(Object[] o) {
      OcCouponCategory result = new OcCouponCategory();
      int i = 0;
        result.setCouponId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCouponCategory> list) {
      JsonArray array = new JsonArray();
      for (OcCouponCategory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.couponId)); 
     builder.append(String.valueOf(this.categoryId)); ;
    return builder.toString();
  }
}