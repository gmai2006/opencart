package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_filter_group_description")
@IdClass(value=OcFilterGroupDescriptionId.class)
public class OcFilterGroupDescription  {
  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Id
  @Column(name="filter_group_id" , length=10)
  @NotNull
  private Integer filterGroupId;

  public OcFilterGroupDescription() {
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
  public void setFilterGroupId( Integer value) {
    this.filterGroupId = value;
  }
  public Integer getFilterGroupId() {
    return this.filterGroupId;
  }

  public String toJson() {
      OcFilterGroupDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcFilterGroupDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcFilterGroupDescription.class);
    }

  public static OcFilterGroupDescription fromArray(Object[] o) {
      OcFilterGroupDescription result = new OcFilterGroupDescription();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFilterGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcFilterGroupDescription> list) {
      JsonArray array = new JsonArray();
      for (OcFilterGroupDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.filterGroupId)); ;
    return builder.toString();
  }
}