package com.opencart.admin.model;

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

  private Integer AttributeId ;

  public void setAttributeId( Integer value) {
    this.AttributeId = value;
  }
  public Integer getAttributeId() {
    return this.AttributeId;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetproductattributesDTO fromArray(Object[] o) {
      GetproductattributesDTO result = new GetproductattributesDTO();
      int i = 0;
        result.setAttributeId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.AttributeId)); ;
    return builder.toString();
  }
}