package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_activity")
public class OcCustomerActivity  {
  @Id
  @Column(name="customer_activity_id" , length=10)
  @NotNull
  private Integer customerActivityId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="data" , length=65535)
  @NotNull
  private String data;

  @Basic
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="key" , length=64)
  @NotNull
  private String key;

  public OcCustomerActivity() {
  }

  public void setCustomerActivityId( Integer value) {
    this.customerActivityId = value;
  }
  public Integer getCustomerActivityId() {
    return this.customerActivityId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setData( String value) {
    this.data = value;
  }
  public String getData() {
    return this.data;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }

  public String toJson() {
      OcCustomerActivity obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerActivity fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerActivity.class);
    }

  public static OcCustomerActivity fromArray(Object[] o) {
      OcCustomerActivity result = new OcCustomerActivity();
      int i = 0;
        result.setCustomerActivityId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setData((String)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setKey((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerActivity> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerActivity dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customerActivityId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.data)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.key)); ;
    return builder.toString();
  }
}