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
public class GetcategoryfiltersDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetcategoryfiltersDTO.class);

  private Integer FilterId ;

  public void setFilterId( Integer value) {
    this.FilterId = value;
  }
  public Integer getFilterId() {
    return this.FilterId;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetcategoryfiltersDTO fromArray(Object[] o) {
      GetcategoryfiltersDTO result = new GetcategoryfiltersDTO();
      int i = 0;
        result.setFilterId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.FilterId)); ;
    return builder.toString();
  }
}