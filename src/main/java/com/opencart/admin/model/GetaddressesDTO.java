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
public class GetaddressesDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetaddressesDTO.class);

  private Integer AddressId ;

  public void setAddressId( Integer value) {
    this.AddressId = value;
  }
  public Integer getAddressId() {
    return this.AddressId;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetaddressesDTO fromArray(Object[] o) {
      GetaddressesDTO result = new GetaddressesDTO();
      int i = 0;
        result.setAddressId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.AddressId)); ;
    return builder.toString();
  }
}