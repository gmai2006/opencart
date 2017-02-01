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
public class GetdownloadDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetdownloadDTO.class);

  private String Filename ;
  private String Mask ;

  public void setFilename( String value) {
    this.Filename = value;
  }
  public String getFilename() {
    return this.Filename;
  }
  public void setMask( String value) {
    this.Mask = value;
  }
  public String getMask() {
    return this.Mask;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetdownloadDTO fromArray(Object[] o) {
      GetdownloadDTO result = new GetdownloadDTO();
      int i = 0;
        result.setFilename((String)BeanUtils.getNullableValue(o[i++]));
        result.setMask((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.Filename)); 
     builder.append(String.valueOf(this.Mask)); ;
    return builder.toString();
  }
}