package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_online")
public class OcCustomerOnline  {
  @Basic
  @Column(name="referer" , length=65535)
  @NotNull
  private String referer;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="url" , length=65535)
  @NotNull
  private String url;

  public OcCustomerOnline() {
  }

  public void setReferer( String value) {
    this.referer = value;
  }
  public String getReferer() {
    return this.referer;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
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
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }

  public String toJson() {
      OcCustomerOnline obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerOnline fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerOnline.class);
    }

  public static OcCustomerOnline fromArray(Object[] o) {
      OcCustomerOnline result = new OcCustomerOnline();
      int i = 0;
        result.setReferer((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setUrl((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerOnline> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerOnline dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.referer)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.url)); ;
    return builder.toString();
  }
}