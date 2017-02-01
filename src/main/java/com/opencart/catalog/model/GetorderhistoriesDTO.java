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
public class GetorderhistoriesDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetorderhistoriesDTO.class);

  private java.sql.Timestamp DateAdded ;
  private String Name ;
  private String Comment ;
  private Boolean Notify ;

  public void setDateAdded( java.sql.Timestamp value) {
    this.DateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.DateAdded;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }
  public void setComment( String value) {
    this.Comment = value;
  }
  public String getComment() {
    return this.Comment;
  }
  public void setNotify( Boolean value) {
    this.Notify = value;
  }
  public Boolean getNotify() {
    return this.Notify;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetorderhistoriesDTO fromArray(Object[] o) {
      GetorderhistoriesDTO result = new GetorderhistoriesDTO();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
        result.setNotify((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.DateAdded)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.Comment)); 
     builder.append(String.valueOf(this.Notify)); ;
    return builder.toString();
  }
}