package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_upload")
public class OcUpload  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="upload_id" , length=10)
  @NotNull
  private Integer uploadId;

  @Basic
  @Column(name="filename" , length=255)
  @NotNull
  private String filename;

  @Basic
  @Column(name="code" , length=255)
  @NotNull
  private String code;

  @Basic
  @Column(name="name" , length=255)
  @NotNull
  private String name;

  public OcUpload() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setUploadId( Integer value) {
    this.uploadId = value;
  }
  public Integer getUploadId() {
    return this.uploadId;
  }
  public void setFilename( String value) {
    this.filename = value;
  }
  public String getFilename() {
    return this.filename;
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

  public String toJson() {
      OcUpload obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcUpload fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcUpload.class);
    }

  public static OcUpload fromArray(Object[] o) {
      OcUpload result = new OcUpload();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setUploadId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFilename((String)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcUpload> list) {
      JsonArray array = new JsonArray();
      for (OcUpload dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.uploadId)); 
     builder.append(String.valueOf(this.filename)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}