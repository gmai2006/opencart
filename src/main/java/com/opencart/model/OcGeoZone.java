package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_geo_zone")
public class OcGeoZone  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Id
  @Column(name="geo_zone_id" , length=10)
  @NotNull
  private Integer geoZoneId;

  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="description" , length=255)
  @NotNull
  private String description;

  public OcGeoZone() {
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
  public void setGeoZoneId( Integer value) {
    this.geoZoneId = value;
  }
  public Integer getGeoZoneId() {
    return this.geoZoneId;
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

  public String toJson() {
      OcGeoZone obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcGeoZone fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcGeoZone.class);
    }

  public static OcGeoZone fromArray(Object[] o) {
      OcGeoZone result = new OcGeoZone();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setGeoZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcGeoZone> list) {
      JsonArray array = new JsonArray();
      for (OcGeoZone dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.geoZoneId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); ;
    return builder.toString();
  }
}