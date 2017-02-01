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
public class GetreturnDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetreturnDTO.class);

  private Integer ReturnId ;
  private Integer OrderId ;
  private String Firstname ;
  private String Lastname ;
  private String Email ;
  private String Telephone ;
  private String Product ;
  private String Model ;
  private Integer Quantity ;
  private Boolean Opened ;
  private String Comment ;
  private java.util.Date DateOrdered ;
  private java.sql.Timestamp DateAdded ;
  private java.sql.Timestamp DateModified ;

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
  public void setEmail( String value) {
    this.Email = value;
  }
  public String getEmail() {
    return this.Email;
  }
  public void setTelephone( String value) {
    this.Telephone = value;
  }
  public String getTelephone() {
    return this.Telephone;
  }
  public void setProduct( String value) {
    this.Product = value;
  }
  public String getProduct() {
    return this.Product;
  }
  public void setModel( String value) {
    this.Model = value;
  }
  public String getModel() {
    return this.Model;
  }
  public void setQuantity( Integer value) {
    this.Quantity = value;
  }
  public Integer getQuantity() {
    return this.Quantity;
  }
  public void setOpened( Boolean value) {
    this.Opened = value;
  }
  public Boolean getOpened() {
    return this.Opened;
  }
  public void setComment( String value) {
    this.Comment = value;
  }
  public String getComment() {
    return this.Comment;
  }
  public void setDateOrdered( java.util.Date value) {
    this.DateOrdered = value;
  }
  public java.util.Date getDateOrdered() {
    return this.DateOrdered;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.DateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.DateAdded;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.DateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.DateModified;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetreturnDTO fromArray(Object[] o) {
      GetreturnDTO result = new GetreturnDTO();
      int i = 0;
        result.setReturnId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFirstname((String)BeanUtils.getNullableValue(o[i++]));
        result.setLastname((String)BeanUtils.getNullableValue(o[i++]));
        result.setEmail((String)BeanUtils.getNullableValue(o[i++]));
        result.setTelephone((String)BeanUtils.getNullableValue(o[i++]));
        result.setProduct((String)BeanUtils.getNullableValue(o[i++]));
        result.setModel((String)BeanUtils.getNullableValue(o[i++]));
        result.setQuantity((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOpened((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateOrdered((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.ReturnId)); 
     builder.append(String.valueOf(this.OrderId)); 
     builder.append(String.valueOf(this.Firstname)); 
     builder.append(String.valueOf(this.Lastname)); 
     builder.append(String.valueOf(this.Email)); 
     builder.append(String.valueOf(this.Telephone)); 
     builder.append(String.valueOf(this.Product)); 
     builder.append(String.valueOf(this.Model)); 
     builder.append(String.valueOf(this.Quantity)); 
     builder.append(String.valueOf(this.Opened)); 
     builder.append(String.valueOf(this.Comment)); 
     builder.append(String.valueOf(this.DateOrdered)); 
     builder.append(String.valueOf(this.DateAdded)); 
     builder.append(String.valueOf(this.DateModified)); ;
    return builder.toString();
  }
}