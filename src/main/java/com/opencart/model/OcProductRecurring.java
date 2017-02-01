package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_recurring")
@IdClass(value=OcProductRecurringId.class)
public class OcProductRecurring  {
  @Id
  @Column(name="recurring_id" , length=10)
  @NotNull
  private Integer recurringId;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @Column(name="customer_group_id" , length=10)
  @NotNull
  private Integer customerGroupId;

  public OcProductRecurring() {
  }

  public void setRecurringId( Integer value) {
    this.recurringId = value;
  }
  public Integer getRecurringId() {
    return this.recurringId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public String toJson() {
      OcProductRecurring obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductRecurring fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductRecurring.class);
    }

  public static OcProductRecurring fromArray(Object[] o) {
      OcProductRecurring result = new OcProductRecurring();
      int i = 0;
        result.setRecurringId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductRecurring> list) {
      JsonArray array = new JsonArray();
      for (OcProductRecurring dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.recurringId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}