package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_coupon_history")
public class OcCouponHistory  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="coupon_history_id" , length=10)
  @NotNull
  private Integer couponHistoryId;

  @Basic
  @Column(name="amount" , length=15)
  @NotNull
  private Long amount;

  @Basic
  @Column(name="coupon_id" , length=10)
  @NotNull
  private Integer couponId;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  public OcCouponHistory() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCouponHistoryId( Integer value) {
    this.couponHistoryId = value;
  }
  public Integer getCouponHistoryId() {
    return this.couponHistoryId;
  }
  public void setAmount( Long value) {
    this.amount = value;
  }
  public Long getAmount() {
    return this.amount;
  }
  public void setCouponId( Integer value) {
    this.couponId = value;
  }
  public Integer getCouponId() {
    return this.couponId;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }

  public String toJson() {
      OcCouponHistory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCouponHistory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCouponHistory.class);
    }

  public static OcCouponHistory fromArray(Object[] o) {
      OcCouponHistory result = new OcCouponHistory();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCouponHistoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setAmount((Long)BeanUtils.getNullableValue(o[i++]));
        result.setCouponId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCouponHistory> list) {
      JsonArray array = new JsonArray();
      for (OcCouponHistory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.couponHistoryId)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.couponId)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.orderId)); ;
    return builder.toString();
  }
}