
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
@Table(name="oc_currency")
public class OcCurrency  {
  @Id
  @Column(name="\"currency_id\"" , length=10)
  @NotNull
  private Integer currency_id;

  @Basic
  @Column(name="\"title\"" , length=32)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"code\"" , length=3)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"symbol_left\"" , length=12)
  @NotNull
  private String symbol_left;

  @Basic
  @Column(name="\"symbol_right\"" , length=12)
  @NotNull
  private String symbol_right;

  @Basic
  @Column(name="\"decimal_place\"" , length=1)
  @NotNull
  private String decimal_place;

  @Basic
  @Column(name="\"value\"" , length=15)
  @NotNull
  private Double value;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcCurrency() {
  }

  public void setCurrencyId( Integer value) {
    this.currency_id = value;
  }
  public Integer getCurrencyId() {
    return this.currency_id;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setSymbolLeft( String value) {
    this.symbol_left = value;
  }
  public String getSymbolLeft() {
    return this.symbol_left;
  }
  public void setSymbolRight( String value) {
    this.symbol_right = value;
  }
  public String getSymbolRight() {
    return this.symbol_right;
  }
  public void setDecimalPlace( String value) {
    this.decimal_place = value;
  }
  public String getDecimalPlace() {
    return this.decimal_place;
  }
  public void setValue( Double value) {
    this.value = value;
  }
  public Double getValue() {
    return this.value;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.date_modified;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.currency_id)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.symbol_left)); 
     builder.append(String.valueOf(this.symbol_right)); 
     builder.append(String.valueOf(this.decimal_place)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}