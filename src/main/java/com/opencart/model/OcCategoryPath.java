package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_category_path")
@IdClass(value=OcCategoryPathId.class)
public class OcCategoryPath  {
  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  @Basic
  @Column(name="level" , length=10)
  @NotNull
  private Integer level;

  @Id
  @Column(name="path_id" , length=10)
  @NotNull
  private Integer pathId;

  public OcCategoryPath() {
  }

  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setLevel( Integer value) {
    this.level = value;
  }
  public Integer getLevel() {
    return this.level;
  }
  public void setPathId( Integer value) {
    this.pathId = value;
  }
  public Integer getPathId() {
    return this.pathId;
  }

  public String toJson() {
      OcCategoryPath obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCategoryPath fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCategoryPath.class);
    }

  public static OcCategoryPath fromArray(Object[] o) {
      OcCategoryPath result = new OcCategoryPath();
      int i = 0;
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLevel((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPathId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCategoryPath> list) {
      JsonArray array = new JsonArray();
      for (OcCategoryPath dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.level)); 
     builder.append(String.valueOf(this.pathId)); ;
    return builder.toString();
  }
}