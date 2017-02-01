package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_history")
public class OcCustomerHistory  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="customer_history_id" , length=10)
  @NotNull
  private Integer customerHistoryId;

  @Basic
  @Column(name="comment" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  public OcCustomerHistory() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCustomerHistoryId( Integer value) {
    this.customerHistoryId = value;
  }
  public Integer getCustomerHistoryId() {
    return this.customerHistoryId;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }

  public String toJson() {
      OcCustomerHistory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerHistory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerHistory.class);
    }

  public static OcCustomerHistory fromArray(Object[] o) {
      OcCustomerHistory result = new OcCustomerHistory();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerHistoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerHistory> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerHistory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.customerHistoryId)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.customerId)); ;
    return builder.toString();
  }
}