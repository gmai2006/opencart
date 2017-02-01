package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_category_to_layout")
@IdClass(value=OcCategoryToLayoutId.class)
public class OcCategoryToLayout  {
  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="layout_id" , length=10)
  @NotNull
  private Integer layoutId;

  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  public OcCategoryToLayout() {
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
  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }

  public String toJson() {
      OcCategoryToLayout obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCategoryToLayout fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCategoryToLayout.class);
    }

  public static OcCategoryToLayout fromArray(Object[] o) {
      OcCategoryToLayout result = new OcCategoryToLayout();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLayoutId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCategoryToLayout> list) {
      JsonArray array = new JsonArray();
      for (OcCategoryToLayout dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.categoryId)); ;
    return builder.toString();
  }
}