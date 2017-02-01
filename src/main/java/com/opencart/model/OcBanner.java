package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_banner")
public class OcBanner  {
  @Id
  @Column(name="banner_id" , length=10)
  @NotNull
  private Integer bannerId;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcBanner() {
  }

  public void setBannerId( Integer value) {
    this.bannerId = value;
  }
  public Integer getBannerId() {
    return this.bannerId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcBanner obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcBanner fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcBanner.class);
    }

  public static OcBanner fromArray(Object[] o) {
      OcBanner result = new OcBanner();
      int i = 0;
        result.setBannerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcBanner> list) {
      JsonArray array = new JsonArray();
      for (OcBanner dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.bannerId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}