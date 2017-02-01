package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_marketing")
public class OcMarketing  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="code" , length=64)
  @NotNull
  private String code;

  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="description" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="clicks" , length=10)
  @NotNull
  private Integer clicks;

  @Id
  @Column(name="marketing_id" , length=10)
  @NotNull
  private Integer marketingId;

  public OcMarketing() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setClicks( Integer value) {
    this.clicks = value;
  }
  public Integer getClicks() {
    return this.clicks;
  }
  public void setMarketingId( Integer value) {
    this.marketingId = value;
  }
  public Integer getMarketingId() {
    return this.marketingId;
  }

  public String toJson() {
      OcMarketing obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcMarketing fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcMarketing.class);
    }

  public static OcMarketing fromArray(Object[] o) {
      OcMarketing result = new OcMarketing();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setClicks((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setMarketingId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcMarketing> list) {
      JsonArray array = new JsonArray();
      for (OcMarketing dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.clicks)); 
     builder.append(String.valueOf(this.marketingId)); ;
    return builder.toString();
  }
}