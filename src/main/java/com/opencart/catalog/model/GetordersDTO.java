package com.opencart.catalog.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencart.utils.BeanUtils;

/**
*/
@XmlRootElement
public class GetordersDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetordersDTO.class);

  private Integer OrderId ;
  private String Firstname ;
  private String Lastname ;
  private String Name ;
  private java.sql.Timestamp DateAdded ;
  private Long Total ;
  private String CurrencyCode ;
  private Long CurrencyValue ;

  public void setOrderId( Integer value) {
    this.OrderId = value;
  }
  public Integer getOrderId() {
    return this.OrderId;
  }
  public void setFirstname( String value) {
    this.Firstname = value;
  }
  public String getFirstname() {
    return this.Firstname;
  }
  public void setLastname( String value) {
    this.Lastname = value;
  }
  public String getLastname() {
    return this.Lastname;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.DateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.DateAdded;
  }
  public void setTotal( Long value) {
    this.Total = value;
  }
  public Long getTotal() {
    return this.Total;
  }
  public void setCurrencyCode( String value) {
    this.CurrencyCode = value;
  }
  public String getCurrencyCode() {
    return this.CurrencyCode;
  }
  public void setCurrencyValue( Long value) {
    this.CurrencyValue = value;
  }
  public Long getCurrencyValue() {
    return this.CurrencyValue;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetordersDTO fromArray(Object[] o) {
      GetordersDTO result = new GetordersDTO();
      int i = 0;
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFirstname((String)BeanUtils.getNullableValue(o[i++]));
        result.setLastname((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setTotal((Long)BeanUtils.getNullableValue(o[i++]));
        result.setCurrencyCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setCurrencyValue((Long)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.OrderId)); 
     builder.append(String.valueOf(this.Firstname)); 
     builder.append(String.valueOf(this.Lastname)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.DateAdded)); 
     builder.append(String.valueOf(this.Total)); 
     builder.append(String.valueOf(this.CurrencyCode)); 
     builder.append(String.valueOf(this.CurrencyValue)); ;
    return builder.toString();
  }
}