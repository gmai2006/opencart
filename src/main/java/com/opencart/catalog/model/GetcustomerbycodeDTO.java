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
public class GetcustomerbycodeDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetcustomerbycodeDTO.class);

  private Integer CustomerId ;
  private String Firstname ;
  private String Lastname ;
  private String Email ;

  public void setCustomerId( Integer value) {
    this.CustomerId = value;
  }
  public Integer getCustomerId() {
    return this.CustomerId;
  }
  public void setFirstname( String value) {
    this.Firstname = value;
  }
  public String getFirstname() {
    return this.Firstname;
  }
  public void setLastname( String value) {
    this.Lastname = value;
  }
  public String getLastname() {
    return this.Lastname;
  }
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

  public static GetcustomerbycodeDTO fromArray(Object[] o) {
      GetcustomerbycodeDTO result = new GetcustomerbycodeDTO();
      int i = 0;
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setFirstname((String)BeanUtils.getNullableValue(o[i++]));
        result.setLastname((String)BeanUtils.getNullableValue(o[i++]));
        result.setEmail((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.CustomerId)); 
     builder.append(String.valueOf(this.Firstname)); 
     builder.append(String.valueOf(this.Lastname)); 
     builder.append(String.valueOf(this.Email)); ;
    return builder.toString();
  }
}