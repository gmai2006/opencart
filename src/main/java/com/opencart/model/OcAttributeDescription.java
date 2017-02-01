package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_attribute_description")
@IdClass(value=OcAttributeDescriptionId.class)
public class OcAttributeDescription  {
  @Id
  @Column(name="attribute_id" , length=10)
  @NotNull
  private Integer attributeId;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcAttributeDescription() {
  }

  public void setAttributeId( Integer value) {
    this.attributeId = value;
  }
  public Integer getAttributeId() {
    return this.attributeId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcAttributeDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAttributeDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAttributeDescription.class);
    }

  public static OcAttributeDescription fromArray(Object[] o) {
      OcAttributeDescription result = new OcAttributeDescription();
      int i = 0;
        result.setAttributeId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAttributeDescription> list) {
      JsonArray array = new JsonArray();
      for (OcAttributeDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attributeId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}