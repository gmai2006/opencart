package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_category_filter")
@IdClass(value=OcCategoryFilterId.class)
public class OcCategoryFilter  {
  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  @Id
  @Column(name="filter_id" , length=10)
  @NotNull
  private Integer filterId;

  public OcCategoryFilter() {
  }

  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setFilterId( Integer value) {
    this.filterId = value;
  }
  public Integer getFilterId() {
    return this.filterId;
  }

  public String toJson() {
      OcCategoryFilter obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCategoryFilter fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCategoryFilter.class);
    }

  public static OcCategoryFilter fromArray(Object[] o) {
      OcCategoryFilter result = new OcCategoryFilter();
      int i = 0;
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFilterId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCategoryFilter> list) {
      JsonArray array = new JsonArray();
      for (OcCategoryFilter dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.filterId)); ;
    return builder.toString();
  }
}