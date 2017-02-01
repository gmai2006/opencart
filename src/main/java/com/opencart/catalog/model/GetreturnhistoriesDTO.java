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
public class GetreturnhistoriesDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetreturnhistoriesDTO.class);

  private java.sql.Timestamp DateAdded ;
  private String Name ;
  private String Comment ;

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

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetreturnhistoriesDTO fromArray(Object[] o) {
      GetreturnhistoriesDTO result = new GetreturnhistoriesDTO();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.DateAdded)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.Comment)); ;
    return builder.toString();
  }
}