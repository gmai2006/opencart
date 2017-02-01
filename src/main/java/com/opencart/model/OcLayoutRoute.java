package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_layout_route")
public class OcLayoutRoute  {
  @Basic
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="layout_id" , length=10)
  @NotNull
  private Integer layoutId;

  @Basic
  @Column(name="route" , length=64)
  @NotNull
  private String route;

  @Id
  @Column(name="layout_route_id" , length=10)
  @NotNull
  private Integer layoutRouteId;

  public OcLayoutRoute() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setLayoutRouteId( Integer value) {
    this.layoutRouteId = value;
  }
  public Integer getLayoutRouteId() {
    return this.layoutRouteId;
  }

  public String toJson() {
      OcLayoutRoute obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcLayoutRoute fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcLayoutRoute.class);
    }

  public static OcLayoutRoute fromArray(Object[] o) {
      OcLayoutRoute result = new OcLayoutRoute();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLayoutId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setRoute((String)BeanUtils.getNullableValue(o[i++]));
        result.setLayoutRouteId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcLayoutRoute> list) {
      JsonArray array = new JsonArray();
      for (OcLayoutRoute dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.route)); 
     builder.append(String.valueOf(this.layoutRouteId)); ;
    return builder.toString();
  }
}