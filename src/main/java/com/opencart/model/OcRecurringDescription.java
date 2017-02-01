package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_recurring_description")
@IdClass(value=OcRecurringDescriptionId.class)
public class OcRecurringDescription  {
  @Id
  @Column(name="recurring_id" , length=10)
  @NotNull
  private Integer recurringId;

  @Basic
  @Column(name="name" , length=255)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcRecurringDescription() {
  }

  public void setRecurringId( Integer value) {
    this.recurringId = value;
  }
  public Integer getRecurringId() {
    return this.recurringId;
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
      OcRecurringDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcRecurringDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcRecurringDescription.class);
    }

  public static OcRecurringDescription fromArray(Object[] o) {
      OcRecurringDescription result = new OcRecurringDescription();
      int i = 0;
        result.setRecurringId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcRecurringDescription> list) {
      JsonArray array = new JsonArray();
      for (OcRecurringDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.recurringId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}