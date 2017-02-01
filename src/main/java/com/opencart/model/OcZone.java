package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_zone")
public class OcZone  {
  @Id
  @Column(name="zone_id" , length=10)
  @NotNull
  private Integer zoneId;

  @Basic
  @Column(name="code" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="name" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="country_id" , length=10)
  @NotNull
  private Integer countryId;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcZone() {
  }

  public void setZoneId( Integer value) {
    this.zoneId = value;
  }
  public Integer getZoneId() {
    return this.zoneId;
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
  public void setCountryId( Integer value) {
    this.countryId = value;
  }
  public Integer getCountryId() {
    return this.countryId;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcZone obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcZone fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcZone.class);
    }

  public static OcZone fromArray(Object[] o) {
      OcZone result = new OcZone();
      int i = 0;
        result.setZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setCountryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcZone> list) {
      JsonArray array = new JsonArray();
      for (OcZone dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.zoneId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.countryId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}