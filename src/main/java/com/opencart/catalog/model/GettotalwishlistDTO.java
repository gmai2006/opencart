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
public class GettotalwishlistDTO implements Serializable {
  static Log logger = LogFactory.getLog(GettotalwishlistDTO.class);

  private Integer total ;

  public void setTotal( Integer value) {
    this.total = value;
  }
  public Integer getTotal() {
    return this.total;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GettotalwishlistDTO fromArray(Object[] o) {
      GettotalwishlistDTO result = new GettotalwishlistDTO();
      int i = 0;
        result.setTotal((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.total)); ;
    return builder.toString();
  }
}