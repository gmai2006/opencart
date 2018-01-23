
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
@Table(name="oc_country")
public class OcCountry  {
  @Id
  @Column(name="\"country_id\"" , length=10)
  @NotNull
  private Integer country_id;

  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"iso_code_2\"" , length=2)
  @NotNull
  private String iso_code_2;

  @Basic
  @Column(name="\"iso_code_3\"" , length=3)
  @NotNull
  private String iso_code_3;

  @Basic
  @Column(name="\"address_format\"" , length=65535)
  @NotNull
  private String address_format;

  @Basic
  @Column(name="\"postcode_required\"" )
  @NotNull
  private Boolean postcode_required;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status = true;

  public OcCountry() {
  }

  public void setCountryId( Integer value) {
    this.country_id = value;
  }
  public Integer getCountryId() {
    return this.country_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setIsoCode2( String value) {
    this.iso_code_2 = value;
  }
  public String getIsoCode2() {
    return this.iso_code_2;
  }
  public void setIsoCode3( String value) {
    this.iso_code_3 = value;
  }
  public String getIsoCode3() {
    return this.iso_code_3;
  }
  public void setAddressFormat( String value) {
    this.address_format = value;
  }
  public String getAddressFormat() {
    return this.address_format;
  }
  public void setPostcodeRequired( Boolean value) {
    this.postcode_required = value;
  }
  public Boolean getPostcodeRequired() {
    return this.postcode_required;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.country_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.iso_code_2)); 
     builder.append(String.valueOf(this.iso_code_3)); 
     builder.append(String.valueOf(this.address_format)); 
     builder.append(String.valueOf(this.postcode_required)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}