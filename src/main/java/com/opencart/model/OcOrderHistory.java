package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_history")
public class OcOrderHistory  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="order_status_id" , length=10)
  @NotNull
  private Integer orderStatusId;

  @Id
  @Column(name="order_history_id" , length=10)
  @NotNull
  private Integer orderHistoryId;

  @Basic
  @Column(name="comment" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="notify" )
  @NotNull
  private Boolean notify;

  public OcOrderHistory() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setOrderStatusId( Integer value) {
    this.orderStatusId = value;
  }
  public Integer getOrderStatusId() {
    return this.orderStatusId;
  }
  public void setOrderHistoryId( Integer value) {
    this.orderHistoryId = value;
  }
  public Integer getOrderHistoryId() {
    return this.orderHistoryId;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setNotify( Boolean value) {
    this.notify = value;
  }
  public Boolean getNotify() {
    return this.notify;
  }

  public String toJson() {
      OcOrderHistory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderHistory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderHistory.class);
    }

  public static OcOrderHistory fromArray(Object[] o) {
      OcOrderHistory result = new OcOrderHistory();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setOrderStatusId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderHistoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setNotify((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderHistory> list) {
      JsonArray array = new JsonArray();
      for (OcOrderHistory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.orderStatusId)); 
     builder.append(String.valueOf(this.orderHistoryId)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.notify)); ;
    return builder.toString();
  }
}