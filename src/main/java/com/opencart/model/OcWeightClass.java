package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_weight_class")
public class OcWeightClass  {
  @Id
  @Column(name="weight_class_id" , length=10)
  @NotNull
  private Integer weightClassId;

  @Basic
  @Column(name="value" , length=15)
  @NotNull
  private Long value;

  public OcWeightClass() {
  }

  public void setWeightClassId( Integer value) {
    this.weightClassId = value;
  }
  public Integer getWeightClassId() {
    return this.weightClassId;
  }
  public void setValue( Long value) {
    this.value = value;
  }
  public Long getValue() {
    return this.value;
  }

  public String toJson() {
      OcWeightClass obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcWeightClass fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcWeightClass.class);
    }

  public static OcWeightClass fromArray(Object[] o) {
      OcWeightClass result = new OcWeightClass();
      int i = 0;
        result.setWeightClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValue((Long)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcWeightClass> list) {
      JsonArray array = new JsonArray();
      for (OcWeightClass dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.weightClassId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}