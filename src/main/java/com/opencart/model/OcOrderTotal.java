package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_total")
public class OcOrderTotal  {
  @Basic
  @Column(name="code" , length=32)
  @NotNull
  private String code;

  @Id
  @Column(name="order_total_id" , length=10)
  @NotNull
  private Integer orderTotalId;

  @Basic
  @Column(name="title" , length=255)
  @NotNull
  private String title;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="value" , length=15)
  @NotNull
  private Long value;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcOrderTotal() {
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setOrderTotalId( Integer value) {
    this.orderTotalId = value;
  }
  public Integer getOrderTotalId() {
    return this.orderTotalId;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setValue( Long value) {
    this.value = value;
  }
  public Long getValue() {
    return this.value;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcOrderTotal obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderTotal fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderTotal.class);
    }

  public static OcOrderTotal fromArray(Object[] o) {
      OcOrderTotal result = new OcOrderTotal();
      int i = 0;
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderTotalId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTitle((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValue((Long)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderTotal> list) {
      JsonArray array = new JsonArray();
      for (OcOrderTotal dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.orderTotalId)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}