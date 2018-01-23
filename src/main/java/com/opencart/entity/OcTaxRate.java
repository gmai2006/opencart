
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
@Table(name="oc_tax_rate")
public class OcTaxRate  {
  @Id
  @Column(name="\"tax_rate_id\"" , length=10)
  @NotNull
  private Integer tax_rate_id;

  @Basic
  @Column(name="\"geo_zone_id\"" , length=10)
  @NotNull
  private Integer geo_zone_id;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"rate\"" , length=15)
  @NotNull
  private java.math.BigDecimal rate = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"type\"" , length=1)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcTaxRate() {
  }

  public void setTaxRateId( Integer value) {
    this.tax_rate_id = value;
  }
  public Integer getTaxRateId() {
    return this.tax_rate_id;
  }
  public void setGeoZoneId( Integer value) {
    this.geo_zone_id = value;
  }
  public Integer getGeoZoneId() {
    return this.geo_zone_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setRate( java.math.BigDecimal value) {
    this.rate = value;
  }
  public java.math.BigDecimal getRate() {
    return this.rate;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
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
     builder.append(String.valueOf(this.tax_rate_id)); 
     builder.append(String.valueOf(this.geo_zone_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.rate)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}