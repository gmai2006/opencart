package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_category_to_store")
@IdClass(value=OcCategoryToStoreId.class)
public class OcCategoryToStore  {
  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  public OcCategoryToStore() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }

  public String toJson() {
      OcCategoryToStore obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCategoryToStore fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCategoryToStore.class);
    }

  public static OcCategoryToStore fromArray(Object[] o) {
      OcCategoryToStore result = new OcCategoryToStore();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCategoryToStore> list) {
      JsonArray array = new JsonArray();
      for (OcCategoryToStore dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.categoryId)); ;
    return builder.toString();
  }
}