package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_filter")
public class OcFilter  {
  @Id
  @Column(name="filter_id" , length=10)
  @NotNull
  private Integer filterId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="filter_group_id" , length=10)
  @NotNull
  private Integer filterGroupId;

  public OcFilter() {
  }

  public void setFilterId( Integer value) {
    this.filterId = value;
  }
  public Integer getFilterId() {
    return this.filterId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setFilterGroupId( Integer value) {
    this.filterGroupId = value;
  }
  public Integer getFilterGroupId() {
    return this.filterGroupId;
  }

  public String toJson() {
      OcFilter obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcFilter fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcFilter.class);
    }

  public static OcFilter fromArray(Object[] o) {
      OcFilter result = new OcFilter();
      int i = 0;
        result.setFilterId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFilterGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcFilter> list) {
      JsonArray array = new JsonArray();
      for (OcFilter dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.filterId)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.filterGroupId)); ;
    return builder.toString();
  }
}