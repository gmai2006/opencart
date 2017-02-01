package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_login")
public class OcCustomerLogin  {
  @Id
  @Column(name="customer_login_id" , length=10)
  @NotNull
  private Integer customerLoginId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="total" , length=10)
  @NotNull
  private Integer total;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="email" , length=96)
  @NotNull
  private String email;

  public OcCustomerLogin() {
  }

  public void setCustomerLoginId( Integer value) {
    this.customerLoginId = value;
  }
  public Integer getCustomerLoginId() {
    return this.customerLoginId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setTotal( Integer value) {
    this.total = value;
  }
  public Integer getTotal() {
    return this.total;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }

  public String toJson() {
      OcCustomerLogin obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerLogin fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerLogin.class);
    }

  public static OcCustomerLogin fromArray(Object[] o) {
      OcCustomerLogin result = new OcCustomerLogin();
      int i = 0;
        result.setCustomerLoginId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setTotal((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setEmail((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerLogin> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerLogin dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customerLoginId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.email)); ;
    return builder.toString();
  }
}