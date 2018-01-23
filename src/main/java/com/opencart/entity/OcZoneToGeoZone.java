
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
@Table(name="oc_zone_to_geo_zone")
public class OcZoneToGeoZone  {
  @Id
  @Column(name="\"zone_to_geo_zone_id\"" , length=10)
  @NotNull
  private Integer zone_to_geo_zone_id;

  @Basic
  @Column(name="\"country_id\"" , length=10)
  @NotNull
  private Integer country_id;

  @Basic
  @Column(name="\"zone_id\"" , length=10)
  @NotNull
  private Integer zone_id;

  @Basic
  @Column(name="\"geo_zone_id\"" , length=10)
  @NotNull
  private Integer geo_zone_id;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcZoneToGeoZone() {
  }

  public void setZoneToGeoZoneId( Integer value) {
    this.zone_to_geo_zone_id = value;
  }
  public Integer getZoneToGeoZoneId() {
    return this.zone_to_geo_zone_id;
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
  public void setGeoZoneId( Integer value) {
    this.geo_zone_id = value;
  }
  public Integer getGeoZoneId() {
    return this.geo_zone_id;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.date_modified;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.zone_to_geo_zone_id)); 
     builder.append(String.valueOf(this.country_id)); 
     builder.append(String.valueOf(this.zone_id)); 
     builder.append(String.valueOf(this.geo_zone_id)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}