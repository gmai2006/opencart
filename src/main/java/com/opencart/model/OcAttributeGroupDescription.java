package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_attribute_group_description")
@IdClass(value=OcAttributeGroupDescriptionId.class)
public class OcAttributeGroupDescription  {
  @Id
  @Column(name="attribute_group_id" , length=10)
  @NotNull
  private Integer attributeGroupId;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcAttributeGroupDescription() {
  }

  public void setAttributeGroupId( Integer value) {
    this.attributeGroupId = value;
  }
  public Integer getAttributeGroupId() {
    return this.attributeGroupId;
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
      OcAttributeGroupDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAttributeGroupDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAttributeGroupDescription.class);
    }

  public static OcAttributeGroupDescription fromArray(Object[] o) {
      OcAttributeGroupDescription result = new OcAttributeGroupDescription();
      int i = 0;
        result.setAttributeGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAttributeGroupDescription> list) {
      JsonArray array = new JsonArray();
      for (OcAttributeGroupDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attributeGroupId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}