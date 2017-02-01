package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_filter_group")
public class OcFilterGroup  {
  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Id
  @Column(name="filter_group_id" , length=10)
  @NotNull
  private Integer filterGroupId;

  public OcFilterGroup() {
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
      OcFilterGroup obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcFilterGroup fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcFilterGroup.class);
    }

  public static OcFilterGroup fromArray(Object[] o) {
      OcFilterGroup result = new OcFilterGroup();
      int i = 0;
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFilterGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcFilterGroup> list) {
      JsonArray array = new JsonArray();
      for (OcFilterGroup dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.filterGroupId)); ;
    return builder.toString();
  }
}