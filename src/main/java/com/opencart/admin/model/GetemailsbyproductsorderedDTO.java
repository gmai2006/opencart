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
public class GetemailsbyproductsorderedDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetemailsbyproductsorderedDTO.class);

  private String Email ;

  public void setEmail( String value) {
    this.Email = value;
  }
  public String getEmail() {
    return this.Email;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetemailsbyproductsorderedDTO fromArray(Object[] o) {
      GetemailsbyproductsorderedDTO result = new GetemailsbyproductsorderedDTO();
      int i = 0;
        result.setEmail((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.Email)); ;
    return builder.toString();
  }
}