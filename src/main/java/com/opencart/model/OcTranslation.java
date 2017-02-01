package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_translation")
public class OcTranslation  {
  @Basic
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Id
  @Column(name="translation_id" , length=10)
  @NotNull
  private Integer translationId;

  @Basic
  @Column(name="route" , length=64)
  @NotNull
  private String route;

  @Basic
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="value" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="key" , length=64)
  @NotNull
  private String key;

  public OcTranslation() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setTranslationId( Integer value) {
    this.translationId = value;
  }
  public Integer getTranslationId() {
    return this.translationId;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }

  public String toJson() {
      OcTranslation obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcTranslation fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcTranslation.class);
    }

  public static OcTranslation fromArray(Object[] o) {
      OcTranslation result = new OcTranslation();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTranslationId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setRoute((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValue((String)BeanUtils.getNullableValue(o[i++]));
        result.setKey((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcTranslation> list) {
      JsonArray array = new JsonArray();
      for (OcTranslation dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.translationId)); 
     builder.append(String.valueOf(this.route)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.key)); ;
    return builder.toString();
  }
}