package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_length_class")
public class OcLengthClass  {
  @Id
  @Column(name="length_class_id" , length=10)
  @NotNull
  private Integer lengthClassId;

  @Basic
  @Column(name="value" , length=15)
  @NotNull
  private Long value;

  public OcLengthClass() {
  }

  public void setLengthClassId( Integer value) {
    this.lengthClassId = value;
  }
  public Integer getLengthClassId() {
    return this.lengthClassId;
  }
  public void setValue( Long value) {
    this.value = value;
  }
  public Long getValue() {
    return this.value;
  }

  public String toJson() {
      OcLengthClass obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcLengthClass fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcLengthClass.class);
    }

  public static OcLengthClass fromArray(Object[] o) {
      OcLengthClass result = new OcLengthClass();
      int i = 0;
        result.setLengthClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValue((Long)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcLengthClass> list) {
      JsonArray array = new JsonArray();
      for (OcLengthClass dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.lengthClassId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}