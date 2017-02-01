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
public class GetreturnreasonsDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetreturnreasonsDTO.class);

  private Integer ReturnReasonId ;
  private String Name ;

  public void setReturnReasonId( Integer value) {
    this.ReturnReasonId = value;
  }
  public Integer getReturnReasonId() {
    return this.ReturnReasonId;
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

  public static GetreturnreasonsDTO fromArray(Object[] o) {
      GetreturnreasonsDTO result = new GetreturnreasonsDTO();
      int i = 0;
        result.setReturnReasonId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.ReturnReasonId)); 
     builder.append(String.valueOf(this.Name)); ;
    return builder.toString();
  }
}