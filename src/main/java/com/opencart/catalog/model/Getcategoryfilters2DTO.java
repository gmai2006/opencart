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
public class Getcategoryfilters2DTO implements Serializable {
  static Log logger = LogFactory.getLog(Getcategoryfilters2DTO.class);

  private Integer FilterId ;
  private String Name ;

  public void setFilterId( Integer value) {
    this.FilterId = value;
  }
  public Integer getFilterId() {
    return this.FilterId;
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

  public static Getcategoryfilters2DTO fromArray(Object[] o) {
      Getcategoryfilters2DTO result = new Getcategoryfilters2DTO();
      int i = 0;
        result.setFilterId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.FilterId)); 
     builder.append(String.valueOf(this.Name)); ;
    return builder.toString();
  }
}