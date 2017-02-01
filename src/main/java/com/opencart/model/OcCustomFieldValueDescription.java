package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_custom_field_value_description")
@IdClass(value=OcCustomFieldValueDescriptionId.class)
public class OcCustomFieldValueDescription  {
  @Basic
  @Column(name="custom_field_id" , length=10)
  @NotNull
  private Integer customFieldId;

  @Basic
  @Column(name="name" , length=128)
  @NotNull
  private String name;

  @Id
  @Column(name="custom_field_value_id" , length=10)
  @NotNull
  private Integer customFieldValueId;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcCustomFieldValueDescription() {
  }

  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setCustomFieldValueId( Integer value) {
    this.customFieldValueId = value;
  }
  public Integer getCustomFieldValueId() {
    return this.customFieldValueId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcCustomFieldValueDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomFieldValueDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomFieldValueDescription.class);
    }

  public static OcCustomFieldValueDescription fromArray(Object[] o) {
      OcCustomFieldValueDescription result = new OcCustomFieldValueDescription();
      int i = 0;
        result.setCustomFieldId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomFieldValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomFieldValueDescription> list) {
      JsonArray array = new JsonArray();
      for (OcCustomFieldValueDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.customFieldValueId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}