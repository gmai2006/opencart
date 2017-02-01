package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_category_description")
@IdClass(value=OcCategoryDescriptionId.class)
public class OcCategoryDescription  {
  @Basic
  @Column(name="meta_description" , length=255)
  @NotNull
  private String metaDescription;

  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  @Basic
  @Column(name="meta_title" , length=255)
  @NotNull
  private String metaTitle;

  @Basic
  @Column(name="meta_keyword" , length=255)
  @NotNull
  private String metaKeyword;

  @Basic
  @Column(name="name" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="description" , length=65535)
  @NotNull
  private String description;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcCategoryDescription() {
  }

  public void setMetaDescription( String value) {
    this.metaDescription = value;
  }
  public String getMetaDescription() {
    return this.metaDescription;
  }
  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
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
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
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

  public String toJson() {
      OcCategoryDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCategoryDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCategoryDescription.class);
    }

  public static OcCategoryDescription fromArray(Object[] o) {
      OcCategoryDescription result = new OcCategoryDescription();
      int i = 0;
        result.setMetaDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setMetaTitle((String)BeanUtils.getNullableValue(o[i++]));
        result.setMetaKeyword((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCategoryDescription> list) {
      JsonArray array = new JsonArray();
      for (OcCategoryDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.metaDescription)); 
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.metaTitle)); 
     builder.append(String.valueOf(this.metaKeyword)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}