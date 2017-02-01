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
public class Getcategoryfilters1DTO implements Serializable {
  static Log logger = LogFactory.getLog(Getcategoryfilters1DTO.class);

  private Integer FilterGroupId ;
  private String Name ;
  private Integer SortOrder ;

  public void setFilterGroupId( Integer value) {
    this.FilterGroupId = value;
  }
  public Integer getFilterGroupId() {
    return this.FilterGroupId;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }
  public void setSortOrder( Integer value) {
    this.SortOrder = value;
  }
  public Integer getSortOrder() {
    return this.SortOrder;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static Getcategoryfilters1DTO fromArray(Object[] o) {
      Getcategoryfilters1DTO result = new Getcategoryfilters1DTO();
      int i = 0;
        result.setFilterGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.FilterGroupId)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.SortOrder)); ;
    return builder.toString();
  }
}