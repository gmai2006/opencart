package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_tax_rate")
public class OcTaxRate  {
  @Id
  @Column(name="tax_rate_id" , length=10)
  @NotNull
  private Integer taxRateId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="rate" , length=15)
  @NotNull
  private Long rate;

  @Basic
  @Column(name="geo_zone_id" , length=10)
  @NotNull
  private Integer geoZoneId;

  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="type" , length=1)
  @NotNull
  private String type;

  public OcTaxRate() {
  }

  public void setTaxRateId( Integer value) {
    this.taxRateId = value;
  }
  public Integer getTaxRateId() {
    return this.taxRateId;
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
  public void setRate( Long value) {
    this.rate = value;
  }
  public Long getRate() {
    return this.rate;
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
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }

  public String toJson() {
      OcTaxRate obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcTaxRate fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcTaxRate.class);
    }

  public static OcTaxRate fromArray(Object[] o) {
      OcTaxRate result = new OcTaxRate();
      int i = 0;
        result.setTaxRateId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setRate((Long)BeanUtils.getNullableValue(o[i++]));
        result.setGeoZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcTaxRate> list) {
      JsonArray array = new JsonArray();
      for (OcTaxRate dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.taxRateId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.rate)); 
     builder.append(String.valueOf(this.geoZoneId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.type)); ;
    return builder.toString();
  }
}