package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_weight_class_description")
@IdClass(value=OcWeightClassDescriptionId.class)
public class OcWeightClassDescription  {
  @Basic
  @Column(name="unit" , length=4)
  @NotNull
  private String unit;

  @Id
  @Column(name="weight_class_id" , length=10)
  @NotNull
  private Integer weightClassId;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="title" , length=32)
  @NotNull
  private String title;

  public OcWeightClassDescription() {
  }

  public void setUnit( String value) {
    this.unit = value;
  }
  public String getUnit() {
    return this.unit;
  }
  public void setWeightClassId( Integer value) {
    this.weightClassId = value;
  }
  public Integer getWeightClassId() {
    return this.weightClassId;
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
      OcWeightClassDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcWeightClassDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcWeightClassDescription.class);
    }

  public static OcWeightClassDescription fromArray(Object[] o) {
      OcWeightClassDescription result = new OcWeightClassDescription();
      int i = 0;
        result.setUnit((String)BeanUtils.getNullableValue(o[i++]));
        result.setWeightClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTitle((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcWeightClassDescription> list) {
      JsonArray array = new JsonArray();
      for (OcWeightClassDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.unit)); 
     builder.append(String.valueOf(this.weightClassId)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.title)); ;
    return builder.toString();
  }
}