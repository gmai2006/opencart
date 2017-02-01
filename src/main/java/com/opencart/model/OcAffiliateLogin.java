package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_affiliate_login")
public class OcAffiliateLogin  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="affiliate_login_id" , length=10)
  @NotNull
  private Integer affiliateLoginId;

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

  public OcAffiliateLogin() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAffiliateLoginId( Integer value) {
    this.affiliateLoginId = value;
  }
  public Integer getAffiliateLoginId() {
    return this.affiliateLoginId;
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
      OcAffiliateLogin obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAffiliateLogin fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAffiliateLogin.class);
    }

  public static OcAffiliateLogin fromArray(Object[] o) {
      OcAffiliateLogin result = new OcAffiliateLogin();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setAffiliateLoginId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTotal((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setEmail((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAffiliateLogin> list) {
      JsonArray array = new JsonArray();
      for (OcAffiliateLogin dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.affiliateLoginId)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.email)); ;
    return builder.toString();
  }
}