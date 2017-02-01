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
public class GetreturnsDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetreturnsDTO.class);

  private Integer ReturnId ;
  private Integer OrderId ;
  private String Firstname ;
  private String Lastname ;
  private String Name ;
  private java.sql.Timestamp DateAdded ;

  public void setReturnId( Integer value) {
    this.ReturnId = value;
  }
  public Integer getReturnId() {
    return this.ReturnId;
  }
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

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetreturnsDTO fromArray(Object[] o) {
      GetreturnsDTO result = new GetreturnsDTO();
      int i = 0;
        result.setReturnId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFirstname((String)BeanUtils.getNullableValue(o[i++]));
        result.setLastname((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.ReturnId)); 
     builder.append(String.valueOf(this.OrderId)); 
     builder.append(String.valueOf(this.Firstname)); 
     builder.append(String.valueOf(this.Lastname)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.DateAdded)); ;
    return builder.toString();
  }
}