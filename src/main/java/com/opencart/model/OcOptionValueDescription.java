package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_option_value_description")
@IdClass(value=OcOptionValueDescriptionId.class)
public class OcOptionValueDescription  {
  @Id
  @Column(name="option_value_id" , length=10)
  @NotNull
  private Integer optionValueId;

  @Basic
  @Column(name="name" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="option_id" , length=10)
  @NotNull
  private Integer optionId;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcOptionValueDescription() {
  }

  public void setOptionValueId( Integer value) {
    this.optionValueId = value;
  }
  public Integer getOptionValueId() {
    return this.optionValueId;
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
      OcOptionValueDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOptionValueDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOptionValueDescription.class);
    }

  public static OcOptionValueDescription fromArray(Object[] o) {
      OcOptionValueDescription result = new OcOptionValueDescription();
      int i = 0;
        result.setOptionValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOptionValueDescription> list) {
      JsonArray array = new JsonArray();
      for (OcOptionValueDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.optionValueId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}