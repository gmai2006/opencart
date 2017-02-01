package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_location")
public class OcLocation  {
  @Basic
  @Column(name="image" , length=255)
  private String image;

  @Basic
  @Column(name="address" , length=65535)
  @NotNull
  private String address;

  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="geocode" , length=32)
  @NotNull
  private String geocode;

  @Basic
  @Column(name="telephone" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="comment" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="fax" , length=32)
  @NotNull
  private String fax;

  @Id
  @Column(name="location_id" , length=10)
  @NotNull
  private Integer locationId;

  @Basic
  @Column(name="open" , length=65535)
  @NotNull
  private String open;

  public OcLocation() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setGeocode( String value) {
    this.geocode = value;
  }
  public String getGeocode() {
    return this.geocode;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setLocationId( Integer value) {
    this.locationId = value;
  }
  public Integer getLocationId() {
    return this.locationId;
  }
  public void setOpen( String value) {
    this.open = value;
  }
  public String getOpen() {
    return this.open;
  }

  public String toJson() {
      OcLocation obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcLocation fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcLocation.class);
    }

  public static OcLocation fromArray(Object[] o) {
      OcLocation result = new OcLocation();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddress((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setGeocode((String)BeanUtils.getNullableValue(o[i++]));
        result.setTelephone((String)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
        result.setFax((String)BeanUtils.getNullableValue(o[i++]));
        result.setLocationId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOpen((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcLocation> list) {
      JsonArray array = new JsonArray();
      for (OcLocation dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.address)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.geocode)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.fax)); 
     builder.append(String.valueOf(this.locationId)); 
     builder.append(String.valueOf(this.open)); ;
    return builder.toString();
  }
}