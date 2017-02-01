package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_address")
public class OcAddress  {
  @Basic
  @Column(name="zone_id" , length=10)
  @NotNull
  private Integer zoneId;

  @Basic
  @Column(name="custom_field" , length=65535)
  @NotNull
  private String customField;

  @Basic
  @Column(name="firstname" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="city" , length=128)
  @NotNull
  private String city;

  @Basic
  @Column(name="address_1" , length=128)
  @NotNull
  private String address1;

  @Basic
  @Column(name="address_2" , length=128)
  @NotNull
  private String address2;

  @Id
  @Column(name="address_id" , length=10)
  @NotNull
  private Integer addressId;

  @Basic
  @Column(name="postcode" , length=10)
  @NotNull
  private String postcode;

  @Basic
  @Column(name="company" , length=40)
  @NotNull
  private String company;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="country_id" , length=10)
  @NotNull
  private Integer countryId;

  @Basic
  @Column(name="lastname" , length=32)
  @NotNull
  private String lastname;

  public OcAddress() {
  }

  public void setZoneId( Integer value) {
    this.zoneId = value;
  }
  public Integer getZoneId() {
    return this.zoneId;
  }
  public void setCustomField( String value) {
    this.customField = value;
  }
  public String getCustomField() {
    return this.customField;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setCity( String value) {
    this.city = value;
  }
  public String getCity() {
    return this.city;
  }
  public void setAddress1( String value) {
    this.address1 = value;
  }
  public String getAddress1() {
    return this.address1;
  }
  public void setAddress2( String value) {
    this.address2 = value;
  }
  public String getAddress2() {
    return this.address2;
  }
  public void setAddressId( Integer value) {
    this.addressId = value;
  }
  public Integer getAddressId() {
    return this.addressId;
  }
  public void setPostcode( String value) {
    this.postcode = value;
  }
  public String getPostcode() {
    return this.postcode;
  }
  public void setCompany( String value) {
    this.company = value;
  }
  public String getCompany() {
    return this.company;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setCountryId( Integer value) {
    this.countryId = value;
  }
  public Integer getCountryId() {
    return this.countryId;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }

  public String toJson() {
      OcAddress obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAddress fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAddress.class);
    }

  public static OcAddress fromArray(Object[] o) {
      OcAddress result = new OcAddress();
      int i = 0;
        result.setZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomField((String)BeanUtils.getNullableValue(o[i++]));
        result.setFirstname((String)BeanUtils.getNullableValue(o[i++]));
        result.setCity((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddress1((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddress2((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddressId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPostcode((String)BeanUtils.getNullableValue(o[i++]));
        result.setCompany((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCountryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLastname((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAddress> list) {
      JsonArray array = new JsonArray();
      for (OcAddress dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.zoneId)); 
     builder.append(String.valueOf(this.customField)); 
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.city)); 
     builder.append(String.valueOf(this.address1)); 
     builder.append(String.valueOf(this.address2)); 
     builder.append(String.valueOf(this.addressId)); 
     builder.append(String.valueOf(this.postcode)); 
     builder.append(String.valueOf(this.company)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.countryId)); 
     builder.append(String.valueOf(this.lastname)); ;
    return builder.toString();
  }
}