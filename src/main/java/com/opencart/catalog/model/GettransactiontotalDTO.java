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
public class GettransactiontotalDTO implements Serializable {
  static Log logger = LogFactory.getLog(GettransactiontotalDTO.class);

  private String total ;

  public void setTotal( String value) {
    this.total = value;
  }
  public String getTotal() {
    return this.total;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GettransactiontotalDTO fromArray(Object[] o) {
      GettransactiontotalDTO result = new GettransactiontotalDTO();
      int i = 0;
        result.setTotal((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.total)); ;
    return builder.toString();
  }
}