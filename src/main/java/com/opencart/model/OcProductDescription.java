package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_description")
@IdClass(value=OcProductDescriptionId.class)
public class OcProductDescription  {
  @Basic
  @Column(name="meta_description" , length=255)
  @NotNull
  private String metaDescription;

  @Basic
  @Column(name="meta_title" , length=255)
  @NotNull
  private String metaTitle;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

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

  @Basic
  @Column(name="tag" , length=65535)
  @NotNull
  private String tag;

  public OcProductDescription() {
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
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
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
  public void setTag( String value) {
    this.tag = value;
  }
  public String getTag() {
    return this.tag;
  }

  public String toJson() {
      OcProductDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductDescription.class);
    }

  public static OcProductDescription fromArray(Object[] o) {
      OcProductDescription result = new OcProductDescription();
      int i = 0;
        result.setMetaDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setMetaTitle((String)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setMetaKeyword((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTag((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductDescription> list) {
      JsonArray array = new JsonArray();
      for (OcProductDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.metaDescription)); 
     builder.append(String.valueOf(this.metaTitle)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.metaKeyword)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.tag)); ;
    return builder.toString();
  }
}