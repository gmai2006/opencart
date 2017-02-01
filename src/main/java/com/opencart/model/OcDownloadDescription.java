package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_download_description")
@IdClass(value=OcDownloadDescriptionId.class)
public class OcDownloadDescription  {
  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Id
  @Column(name="download_id" , length=10)
  @NotNull
  private Integer downloadId;

  public OcDownloadDescription() {
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
  public void setDownloadId( Integer value) {
    this.downloadId = value;
  }
  public Integer getDownloadId() {
    return this.downloadId;
  }

  public String toJson() {
      OcDownloadDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcDownloadDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcDownloadDescription.class);
    }

  public static OcDownloadDescription fromArray(Object[] o) {
      OcDownloadDescription result = new OcDownloadDescription();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDownloadId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcDownloadDescription> list) {
      JsonArray array = new JsonArray();
      for (OcDownloadDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.downloadId)); ;
    return builder.toString();
  }
}