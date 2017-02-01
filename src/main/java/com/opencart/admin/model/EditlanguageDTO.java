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
public class EditlanguageDTO implements Serializable {
  static Log logger = LogFactory.getLog(EditlanguageDTO.class);

  private String Code ;

  public void setCode( String value) {
    this.Code = value;
  }
  public String getCode() {
    return this.Code;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static EditlanguageDTO fromArray(Object[] o) {
      EditlanguageDTO result = new EditlanguageDTO();
      int i = 0;
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.Code)); ;
    return builder.toString();
  }
}