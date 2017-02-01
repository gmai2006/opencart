package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_country")
public class OcCountry  {
  @Basic
  @Column(name="iso_code_2" , length=2)
  @NotNull
  private String isoCode2;

  @Basic
  @Column(name="address_format" , length=65535)
  @NotNull
  private String addressFormat;

  @Basic
  @Column(name="iso_code_3" , length=3)
  @NotNull
  private String isoCode3;

  @Basic
  @Column(name="name" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="postcode_required" )
  @NotNull
  private Boolean postcodeRequired;

  @Id
  @Column(name="country_id" , length=10)
  @NotNull
  private Integer countryId;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcCountry() {
  }

  public void setIsoCode2( String value) {
    this.isoCode2 = value;
  }
  public String getIsoCode2() {
    return this.isoCode2;
  }
  public void setAddressFormat( String value) {
    this.addressFormat = value;
  }
  public String getAddressFormat() {
    return this.addressFormat;
  }
  public void setIsoCode3( String value) {
    this.isoCode3 = value;
  }
  public String getIsoCode3() {
    return this.isoCode3;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setPostcodeRequired( Boolean value) {
    this.postcodeRequired = value;
  }
  public Boolean getPostcodeRequired() {
    return this.postcodeRequired;
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
      OcCountry obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCountry fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCountry.class);
    }

  public static OcCountry fromArray(Object[] o) {
      OcCountry result = new OcCountry();
      int i = 0;
        result.setIsoCode2((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddressFormat((String)BeanUtils.getNullableValue(o[i++]));
        result.setIsoCode3((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setPostcodeRequired((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setCountryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCountry> list) {
      JsonArray array = new JsonArray();
      for (OcCountry dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.isoCode2)); 
     builder.append(String.valueOf(this.addressFormat)); 
     builder.append(String.valueOf(this.isoCode3)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.postcodeRequired)); 
     builder.append(String.valueOf(this.countryId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}