package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_status")
@IdClass(value=OcOrderStatusId.class)
public class OcOrderStatus  {
  @Id
  @Column(name="order_status_id" , length=10)
  @NotNull
  private Integer orderStatusId;

  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcOrderStatus() {
  }

  public void setOrderStatusId( Integer value) {
    this.orderStatusId = value;
  }
  public Integer getOrderStatusId() {
    return this.orderStatusId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcOrderStatus obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderStatus fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderStatus.class);
    }

  public static OcOrderStatus fromArray(Object[] o) {
      OcOrderStatus result = new OcOrderStatus();
      int i = 0;
        result.setOrderStatusId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderStatus> list) {
      JsonArray array = new JsonArray();
      for (OcOrderStatus dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.orderStatusId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}