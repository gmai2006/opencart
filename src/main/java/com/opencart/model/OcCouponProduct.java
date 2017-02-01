package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_coupon_product")
public class OcCouponProduct  {
  @Basic
  @Column(name="coupon_id" , length=10)
  @NotNull
  private Integer couponId;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @Column(name="coupon_product_id" , length=10)
  @NotNull
  private Integer couponProductId;

  public OcCouponProduct() {
  }

  public void setCouponId( Integer value) {
    this.couponId = value;
  }
  public Integer getCouponId() {
    return this.couponId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setCouponProductId( Integer value) {
    this.couponProductId = value;
  }
  public Integer getCouponProductId() {
    return this.couponProductId;
  }

  public String toJson() {
      OcCouponProduct obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCouponProduct fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCouponProduct.class);
    }

  public static OcCouponProduct fromArray(Object[] o) {
      OcCouponProduct result = new OcCouponProduct();
      int i = 0;
        result.setCouponId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCouponProductId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCouponProduct> list) {
      JsonArray array = new JsonArray();
      for (OcCouponProduct dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.couponId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.couponProductId)); ;
    return builder.toString();
  }
}