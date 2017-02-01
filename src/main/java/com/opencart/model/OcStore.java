package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_store")
public class OcStore  {
  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="ssl" , length=255)
  @NotNull
  private String ssl;

  @Basic
  @Column(name="url" , length=255)
  @NotNull
  private String url;

  public OcStore() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setSsl( String value) {
    this.ssl = value;
  }
  public String getSsl() {
    return this.ssl;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }

  public String toJson() {
      OcStore obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcStore fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcStore.class);
    }

  public static OcStore fromArray(Object[] o) {
      OcStore result = new OcStore();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setSsl((String)BeanUtils.getNullableValue(o[i++]));
        result.setUrl((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcStore> list) {
      JsonArray array = new JsonArray();
      for (OcStore dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.ssl)); 
     builder.append(String.valueOf(this.url)); ;
    return builder.toString();
  }
}