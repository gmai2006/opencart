
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
@Table(name="oc_location")
public class OcLocation  {
  @Id
  @Column(name="\"location_id\"" , length=10)
  @NotNull
  private Integer location_id;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"address\"" , length=65535)
  @NotNull
  private String address;

  @Basic
  @Column(name="\"telephone\"" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="\"fax\"" , length=32)
  @NotNull
  private String fax;

  @Basic
  @Column(name="\"geocode\"" , length=32)
  @NotNull
  private String geocode;

  @Basic
  @Column(name="\"image\"" , length=255)
  private String image;

  @Basic
  @Column(name="\"open\"" , length=65535)
  @NotNull
  private String open;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  @NotNull
  private String comment;

  public OcLocation() {
  }

  public void setLocationId( Integer value) {
    this.location_id = value;
  }
  public Integer getLocationId() {
    return this.location_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setGeocode( String value) {
    this.geocode = value;
  }
  public String getGeocode() {
    return this.geocode;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setOpen( String value) {
    this.open = value;
  }
  public String getOpen() {
    return this.open;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.location_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.address)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.fax)); 
     builder.append(String.valueOf(this.geocode)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.open)); 
     builder.append(String.valueOf(this.comment)); ;
    return builder.toString();
  }
}