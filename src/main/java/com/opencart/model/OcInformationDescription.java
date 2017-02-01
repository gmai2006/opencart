package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_information_description")
@IdClass(value=OcInformationDescriptionId.class)
public class OcInformationDescription  {
  @Id
  @Column(name="information_id" , length=10)
  @NotNull
  private Integer informationId;

  @Basic
  @Column(name="meta_description" , length=255)
  @NotNull
  private String metaDescription;

  @Basic
  @Column(name="meta_title" , length=255)
  @NotNull
  private String metaTitle;

  @Basic
  @Column(name="meta_keyword" , length=255)
  @NotNull
  private String metaKeyword;

  @Basic
  @Column(name="description" , length=16777215)
  @NotNull
  private String description;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="title" , length=64)
  @NotNull
  private String title;

  public OcInformationDescription() {
  }

  public void setInformationId( Integer value) {
    this.informationId = value;
  }
  public Integer getInformationId() {
    return this.informationId;
  }
  public void setMetaDescription( String value) {
    this.metaDescription = value;
  }
  public String getMetaDescription() {
    return this.metaDescription;
  }
  public void setMetaTitle( String value) {
    this.metaTitle = value;
  }
  public String getMetaTitle() {
    return this.metaTitle;
  }
  public void setMetaKeyword( String value) {
    this.metaKeyword = value;
  }
  public String getMetaKeyword() {
    return this.metaKeyword;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
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
      OcInformationDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcInformationDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcInformationDescription.class);
    }

  public static OcInformationDescription fromArray(Object[] o) {
      OcInformationDescription result = new OcInformationDescription();
      int i = 0;
        result.setInformationId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setMetaDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setMetaTitle((String)BeanUtils.getNullableValue(o[i++]));
        result.setMetaKeyword((String)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTitle((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcInformationDescription> list) {
      JsonArray array = new JsonArray();
      for (OcInformationDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.informationId)); 
     builder.append(String.valueOf(this.metaDescription)); 
     builder.append(String.valueOf(this.metaTitle)); 
     builder.append(String.valueOf(this.metaKeyword)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.title)); ;
    return builder.toString();
  }
}