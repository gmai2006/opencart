package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_currency")
public class OcCurrency  {
  @Basic
  @Column(name="symbol_right" , length=12)
  @NotNull
  private String symbolRight;

  @Basic
  @Column(name="code" , length=3)
  @NotNull
  private String code;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="symbol_left" , length=12)
  @NotNull
  private String symbolLeft;

  @Basic
  @Column(name="title" , length=32)
  @NotNull
  private String title;

  @Basic
  @Column(name="decimal_place" , length=1)
  @NotNull
  private String decimalPlace;

  @Basic
  @Column(name="value" , length=15)
  @NotNull
  private Double value;

  @Id
  @Column(name="currency_id" , length=10)
  @NotNull
  private Integer currencyId;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcCurrency() {
  }

  public void setSymbolRight( String value) {
    this.symbolRight = value;
  }
  public String getSymbolRight() {
    return this.symbolRight;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setSymbolLeft( String value) {
    this.symbolLeft = value;
  }
  public String getSymbolLeft() {
    return this.symbolLeft;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setDecimalPlace( String value) {
    this.decimalPlace = value;
  }
  public String getDecimalPlace() {
    return this.decimalPlace;
  }
  public void setValue( Double value) {
    this.value = value;
  }
  public Double getValue() {
    return this.value;
  }
  public void setCurrencyId( Integer value) {
    this.currencyId = value;
  }
  public Integer getCurrencyId() {
    return this.currencyId;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcCurrency obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCurrency fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCurrency.class);
    }

  public static OcCurrency fromArray(Object[] o) {
      OcCurrency result = new OcCurrency();
      int i = 0;
        result.setSymbolRight((String)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setSymbolLeft((String)BeanUtils.getNullableValue(o[i++]));
        result.setTitle((String)BeanUtils.getNullableValue(o[i++]));
        result.setDecimalPlace((String)BeanUtils.getNullableValue(o[i++]));
        result.setValue((Double)BeanUtils.getNullableValue(o[i++]));
        result.setCurrencyId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCurrency> list) {
      JsonArray array = new JsonArray();
      for (OcCurrency dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.symbolRight)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.symbolLeft)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.decimalPlace)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.currencyId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}