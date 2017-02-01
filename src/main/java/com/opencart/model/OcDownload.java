package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_download")
public class OcDownload  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="filename" , length=160)
  @NotNull
  private String filename;

  @Id
  @Column(name="download_id" , length=10)
  @NotNull
  private Integer downloadId;

  @Basic
  @Column(name="mask" , length=128)
  @NotNull
  private String mask;

  public OcDownload() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setFilename( String value) {
    this.filename = value;
  }
  public String getFilename() {
    return this.filename;
  }
  public void setDownloadId( Integer value) {
    this.downloadId = value;
  }
  public Integer getDownloadId() {
    return this.downloadId;
  }
  public void setMask( String value) {
    this.mask = value;
  }
  public String getMask() {
    return this.mask;
  }

  public String toJson() {
      OcDownload obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcDownload fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcDownload.class);
    }

  public static OcDownload fromArray(Object[] o) {
      OcDownload result = new OcDownload();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setFilename((String)BeanUtils.getNullableValue(o[i++]));
        result.setDownloadId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setMask((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcDownload> list) {
      JsonArray array = new JsonArray();
      for (OcDownload dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.filename)); 
     builder.append(String.valueOf(this.downloadId)); 
     builder.append(String.valueOf(this.mask)); ;
    return builder.toString();
  }
}