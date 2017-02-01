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
public class Getproductattributes1DTO implements Serializable {
  static Log logger = LogFactory.getLog(Getproductattributes1DTO.class);

  private Integer AttributeId ;
  private String Name ;
  private String Text ;

  public void setAttributeId( Integer value) {
    this.AttributeId = value;
  }
  public Integer getAttributeId() {
    return this.AttributeId;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }
  public void setText( String value) {
    this.Text = value;
  }
  public String getText() {
    return this.Text;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static Getproductattributes1DTO fromArray(Object[] o) {
      Getproductattributes1DTO result = new Getproductattributes1DTO();
      int i = 0;
        result.setAttributeId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setText((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.AttributeId)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.Text)); ;
    return builder.toString();
  }
}