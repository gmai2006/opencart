package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_theme")
public class OcTheme  {
  @Basic
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="route" , length=64)
  @NotNull
  private String route;

  @Basic
  @Column(name="code" , length=65535)
  @NotNull
  private String code;

  @Id
  @Column(name="theme_id" , length=10)
  @NotNull
  private Integer themeId;

  @Basic
  @Column(name="theme" , length=64)
  @NotNull
  private String theme;

  public OcTheme() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setThemeId( Integer value) {
    this.themeId = value;
  }
  public Integer getThemeId() {
    return this.themeId;
  }
  public void setTheme( String value) {
    this.theme = value;
  }
  public String getTheme() {
    return this.theme;
  }

  public String toJson() {
      OcTheme obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcTheme fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcTheme.class);
    }

  public static OcTheme fromArray(Object[] o) {
      OcTheme result = new OcTheme();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setRoute((String)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setThemeId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTheme((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcTheme> list) {
      JsonArray array = new JsonArray();
      for (OcTheme dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.route)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.themeId)); 
     builder.append(String.valueOf(this.theme)); ;
    return builder.toString();
  }
}