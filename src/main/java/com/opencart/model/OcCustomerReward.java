package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_reward")
public class OcCustomerReward  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="customer_reward_id" , length=10)
  @NotNull
  private Integer customerRewardId;

  @Basic
  @Column(name="description" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="points" , length=10)
  @NotNull
  private Integer points;

  public OcCustomerReward() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCustomerRewardId( Integer value) {
    this.customerRewardId = value;
  }
  public Integer getCustomerRewardId() {
    return this.customerRewardId;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
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
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }

  public String toJson() {
      OcCustomerReward obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerReward fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerReward.class);
    }

  public static OcCustomerReward fromArray(Object[] o) {
      OcCustomerReward result = new OcCustomerReward();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerRewardId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPoints((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerReward> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerReward dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.customerRewardId)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.points)); ;
    return builder.toString();
  }
}