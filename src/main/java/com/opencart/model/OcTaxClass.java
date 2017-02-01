package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_tax_class")
public class OcTaxClass  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Id
  @Column(name="tax_class_id" , length=10)
  @NotNull
  private Integer taxClassId;

  @Basic
  @Column(name="description" , length=255)
  @NotNull
  private String description;

  @Basic
  @Column(name="title" , length=32)
  @NotNull
  private String title;

  public OcTaxClass() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setTaxClassId( Integer value) {
    this.taxClassId = value;
  }
  public Integer getTaxClassId() {
    return this.taxClassId;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }

  public String toJson() {
      OcTaxClass obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcTaxClass fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcTaxClass.class);
    }

  public static OcTaxClass fromArray(Object[] o) {
      OcTaxClass result = new OcTaxClass();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setTaxClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setTitle((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcTaxClass> list) {
      JsonArray array = new JsonArray();
      for (OcTaxClass dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.taxClassId)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.title)); ;
    return builder.toString();
  }
}