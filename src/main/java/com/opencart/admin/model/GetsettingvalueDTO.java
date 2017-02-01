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
public class GetsettingvalueDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetsettingvalueDTO.class);

  private String Value ;

  public void setValue( String value) {
    this.Value = value;
  }
  public String getValue() {
    return this.Value;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetsettingvalueDTO fromArray(Object[] o) {
      GetsettingvalueDTO result = new GetsettingvalueDTO();
      int i = 0;
        result.setValue((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.Value)); ;
    return builder.toString();
  }
}