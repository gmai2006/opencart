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
public class GetproductattributesDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetproductattributesDTO.class);

  private Integer AttributeGroupId ;
  private String Name ;

  public void setAttributeGroupId( Integer value) {
    this.AttributeGroupId = value;
  }
  public Integer getAttributeGroupId() {
    return this.AttributeGroupId;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetproductattributesDTO fromArray(Object[] o) {
      GetproductattributesDTO result = new GetproductattributesDTO();
      int i = 0;
        result.setAttributeGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.AttributeGroupId)); 
     builder.append(String.valueOf(this.Name)); ;
    return builder.toString();
  }
}