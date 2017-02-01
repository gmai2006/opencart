package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_length_class_description")
@IdClass(value=OcLengthClassDescriptionId.class)
public class OcLengthClassDescription  {
  @Id
  @Column(name="length_class_id" , length=10)
  @NotNull
  private Integer lengthClassId;

  @Basic
  @Column(name="unit" , length=4)
  @NotNull
  private String unit;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="title" , length=32)
  @NotNull
  private String title;

  public OcLengthClassDescription() {
  }

  public void setLengthClassId( Integer value) {
    this.lengthClassId = value;
  }
  public Integer getLengthClassId() {
    return this.lengthClassId;
  }
  public void setUnit( String value) {
    this.unit = value;
  }
  public String getUnit() {
    return this.unit;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }

  public String toJson() {
      OcLengthClassDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcLengthClassDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcLengthClassDescription.class);
    }

  public static OcLengthClassDescription fromArray(Object[] o) {
      OcLengthClassDescription result = new OcLengthClassDescription();
      int i = 0;
        result.setLengthClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setUnit((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTitle((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcLengthClassDescription> list) {
      JsonArray array = new JsonArray();
      for (OcLengthClassDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.lengthClassId)); 
     builder.append(String.valueOf(this.unit)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.title)); ;
    return builder.toString();
  }
}