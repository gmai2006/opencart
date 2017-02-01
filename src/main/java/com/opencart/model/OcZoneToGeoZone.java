package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_zone_to_geo_zone")
public class OcZoneToGeoZone  {
  @Id
  @Column(name="zone_to_geo_zone_id" , length=10)
  @NotNull
  private Integer zoneToGeoZoneId;

  @Basic
  @Column(name="zone_id" , length=10)
  @NotNull
  private Integer zoneId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="geo_zone_id" , length=10)
  @NotNull
  private Integer geoZoneId;

  @Basic
  @Column(name="country_id" , length=10)
  @NotNull
  private Integer countryId;

  public OcZoneToGeoZone() {
  }

  public void setZoneToGeoZoneId( Integer value) {
    this.zoneToGeoZoneId = value;
  }
  public Integer getZoneToGeoZoneId() {
    return this.zoneToGeoZoneId;
  }
  public void setZoneId( Integer value) {
    this.zoneId = value;
  }
  public Integer getZoneId() {
    return this.zoneId;
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
  public void setCountryId( Integer value) {
    this.countryId = value;
  }
  public Integer getCountryId() {
    return this.countryId;
  }

  public String toJson() {
      OcZoneToGeoZone obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcZoneToGeoZone fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcZoneToGeoZone.class);
    }

  public static OcZoneToGeoZone fromArray(Object[] o) {
      OcZoneToGeoZone result = new OcZoneToGeoZone();
      int i = 0;
        result.setZoneToGeoZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setGeoZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCountryId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcZoneToGeoZone> list) {
      JsonArray array = new JsonArray();
      for (OcZoneToGeoZone dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.zoneToGeoZoneId)); 
     builder.append(String.valueOf(this.zoneId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.geoZoneId)); 
     builder.append(String.valueOf(this.countryId)); ;
    return builder.toString();
  }
}