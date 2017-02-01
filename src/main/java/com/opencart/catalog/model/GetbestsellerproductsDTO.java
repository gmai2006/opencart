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
public class GetbestsellerproductsDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetbestsellerproductsDTO.class);

  private Integer ProductId ;

  public void setProductId( Integer value) {
    this.ProductId = value;
  }
  public Integer getProductId() {
    return this.ProductId;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetbestsellerproductsDTO fromArray(Object[] o) {
      GetbestsellerproductsDTO result = new GetbestsellerproductsDTO();
      int i = 0;
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.ProductId)); ;
    return builder.toString();
  }
}