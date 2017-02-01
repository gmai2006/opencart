package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_modification")
public class OcModification  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="code" , length=64)
  @NotNull
  private String code;

  @Id
  @Column(name="modification_id" , length=10)
  @NotNull
  private Integer modificationId;

  @Basic
  @Column(name="author" , length=64)
  @NotNull
  private String author;

  @Basic
  @Column(name="xml" , length=16777215)
  @NotNull
  private String xml;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="link" , length=255)
  @NotNull
  private String link;

  @Basic
  @Column(name="version" , length=32)
  @NotNull
  private String version;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcModification() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setModificationId( Integer value) {
    this.modificationId = value;
  }
  public Integer getModificationId() {
    return this.modificationId;
  }
  public void setAuthor( String value) {
    this.author = value;
  }
  public String getAuthor() {
    return this.author;
  }
  public void setXml( String value) {
    this.xml = value;
  }
  public String getXml() {
    return this.xml;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcModification obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcModification fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcModification.class);
    }

  public static OcModification fromArray(Object[] o) {
      OcModification result = new OcModification();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setModificationId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setAuthor((String)BeanUtils.getNullableValue(o[i++]));
        result.setXml((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLink((String)BeanUtils.getNullableValue(o[i++]));
        result.setVersion((String)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcModification> list) {
      JsonArray array = new JsonArray();
      for (OcModification dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.modificationId)); 
     builder.append(String.valueOf(this.author)); 
     builder.append(String.valueOf(this.xml)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.link)); 
     builder.append(String.valueOf(this.version)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}