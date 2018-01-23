
package com.opencart.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_address")
public class OcAddress  {
  @Id
  @Column(name="\"address_id\"" , length=10)
  @NotNull
  private Integer address_id;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="\"company\"" , length=40)
  @NotNull
  private String company;

  @Basic
  @Column(name="\"address_1\"" , length=128)
  @NotNull
  private String address_1;

  @Basic
  @Column(name="\"address_2\"" , length=128)
  @NotNull
  private String address_2;

  @Basic
  @Column(name="\"city\"" , length=128)
  @NotNull
  private String city;

  @Basic
  @Column(name="\"postcode\"" , length=10)
  @NotNull
  private String postcode;

  @Basic
  @Column(name="\"country_id\"" , length=10)
  @NotNull
  private Integer country_id;

  @Basic
  @Column(name="\"zone_id\"" , length=10)
  @NotNull
  private Integer zone_id;

  @Basic
  @Column(name="\"custom_field\"" , length=65535)
  @NotNull
  private String custom_field;

  public OcAddress() {
  }

  public void setAddressId( Integer value) {
    this.address_id = value;
  }
  public Integer getAddressId() {
    return this.address_id;
  }
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setCompany( String value) {
    this.company = value;
  }
  public String getCompany() {
    return this.company;
  }
  public void setAddress1( String value) {
    this.address_1 = value;
  }
  public String getAddress1() {
    return this.address_1;
  }
  public void setAddress2( String value) {
    this.address_2 = value;
  }
  public String getAddress2() {
    return this.address_2;
  }
  public void setCity( String value) {
    this.city = value;
  }
  public String getCity() {
    return this.city;
  }
  public void setPostcode( String value) {
    this.postcode = value;
  }
  public String getPostcode() {
    return this.postcode;
  }
  public void setCountryId( Integer value) {
    this.country_id = value;
  }
  public Integer getCountryId() {
    return this.country_id;
  }
  public void setZoneId( Integer value) {
    this.zone_id = value;
  }
  public Integer getZoneId() {
    return this.zone_id;
  }
  public void setCustomField( String value) {
    this.custom_field = value;
  }
  public String getCustomField() {
    return this.custom_field;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.address_id)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.company)); 
     builder.append(String.valueOf(this.address_1)); 
     builder.append(String.valueOf(this.address_2)); 
     builder.append(String.valueOf(this.city)); 
     builder.append(String.valueOf(this.postcode)); 
     builder.append(String.valueOf(this.country_id)); 
     builder.append(String.valueOf(this.zone_id)); 
     builder.append(String.valueOf(this.custom_field)); ;
    return builder.toString();
  }
}