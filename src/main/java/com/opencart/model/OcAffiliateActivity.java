package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_affiliate_activity")
public class OcAffiliateActivity  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="affiliate_activity_id" , length=10)
  @NotNull
  private Integer affiliateActivityId;

  @Basic
  @Column(name="data" , length=65535)
  @NotNull
  private String data;

  @Basic
  @Column(name="affiliate_id" , length=10)
  @NotNull
  private Integer affiliateId;

  @Basic
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="key" , length=64)
  @NotNull
  private String key;

  public OcAffiliateActivity() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAffiliateActivityId( Integer value) {
    this.affiliateActivityId = value;
  }
  public Integer getAffiliateActivityId() {
    return this.affiliateActivityId;
  }
  public void setData( String value) {
    this.data = value;
  }
  public String getData() {
    return this.data;
  }
  public void setAffiliateId( Integer value) {
    this.affiliateId = value;
  }
  public Integer getAffiliateId() {
    return this.affiliateId;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }

  public String toJson() {
      OcAffiliateActivity obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAffiliateActivity fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAffiliateActivity.class);
    }

  public static OcAffiliateActivity fromArray(Object[] o) {
      OcAffiliateActivity result = new OcAffiliateActivity();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setAffiliateActivityId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setData((String)BeanUtils.getNullableValue(o[i++]));
        result.setAffiliateId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setKey((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAffiliateActivity> list) {
      JsonArray array = new JsonArray();
      for (OcAffiliateActivity dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.affiliateActivityId)); 
     builder.append(String.valueOf(this.data)); 
     builder.append(String.valueOf(this.affiliateId)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.key)); ;
    return builder.toString();
  }
}