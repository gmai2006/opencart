package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_reward")
public class OcProductReward  {
  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @Column(name="product_reward_id" , length=10)
  @NotNull
  private Integer productRewardId;

  @Basic
  @Column(name="customer_group_id" , length=10)
  @NotNull
  private Integer customerGroupId;

  @Basic
  @Column(name="points" , length=10)
  @NotNull
  private Integer points;

  public OcProductReward() {
  }

  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setProductRewardId( Integer value) {
    this.productRewardId = value;
  }
  public Integer getProductRewardId() {
    return this.productRewardId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }

  public String toJson() {
      OcProductReward obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductReward fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductReward.class);
    }

  public static OcProductReward fromArray(Object[] o) {
      OcProductReward result = new OcProductReward();
      int i = 0;
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductRewardId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPoints((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductReward> list) {
      JsonArray array = new JsonArray();
      for (OcProductReward dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.productRewardId)); 
     builder.append(String.valueOf(this.customerGroupId)); 
     builder.append(String.valueOf(this.points)); ;
    return builder.toString();
  }
}