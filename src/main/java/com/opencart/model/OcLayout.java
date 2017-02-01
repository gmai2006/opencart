package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_layout")
public class OcLayout  {
  @Id
  @Column(name="layout_id" , length=10)
  @NotNull
  private Integer layoutId;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  public OcLayout() {
  }

  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }

  public String toJson() {
      OcLayout obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcLayout fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcLayout.class);
    }

  public static OcLayout fromArray(Object[] o) {
      OcLayout result = new OcLayout();
      int i = 0;
        result.setLayoutId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcLayout> list) {
      JsonArray array = new JsonArray();
      for (OcLayout dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}