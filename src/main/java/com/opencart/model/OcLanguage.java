package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_language")
public class OcLanguage  {
  @Basic
  @Column(name="image" , length=64)
  @NotNull
  private String image;

  @Basic
  @Column(name="code" , length=5)
  @NotNull
  private String code;

  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="locale" , length=255)
  @NotNull
  private String locale;

  @Basic
  @Column(name="directory" , length=32)
  @NotNull
  private String directory;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcLanguage() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
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
  public void setLocale( String value) {
    this.locale = value;
  }
  public String getLocale() {
    return this.locale;
  }
  public void setDirectory( String value) {
    this.directory = value;
  }
  public String getDirectory() {
    return this.directory;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcLanguage obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcLanguage fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcLanguage.class);
    }

  public static OcLanguage fromArray(Object[] o) {
      OcLanguage result = new OcLanguage();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLocale((String)BeanUtils.getNullableValue(o[i++]));
        result.setDirectory((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcLanguage> list) {
      JsonArray array = new JsonArray();
      for (OcLanguage dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.locale)); 
     builder.append(String.valueOf(this.directory)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}