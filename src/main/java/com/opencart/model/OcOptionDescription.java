package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_option_description")
@IdClass(value=OcOptionDescriptionId.class)
public class OcOptionDescription  {
  @Basic
  @Column(name="name" , length=128)
  @NotNull
  private String name;

  @Id
  @Column(name="option_id" , length=10)
  @NotNull
  private Integer optionId;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcOptionDescription() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setOptionId( Integer value) {
    this.optionId = value;
  }
  public Integer getOptionId() {
    return this.optionId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcOptionDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOptionDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOptionDescription.class);
    }

  public static OcOptionDescription fromArray(Object[] o) {
      OcOptionDescription result = new OcOptionDescription();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOptionDescription> list) {
      JsonArray array = new JsonArray();
      for (OcOptionDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}