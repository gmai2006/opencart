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
public class GettotalcustomerrewardsbyorderidDTO implements Serializable {
  static Log logger = LogFactory.getLog(GettotalcustomerrewardsbyorderidDTO.class);

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

  public static GettotalcustomerrewardsbyorderidDTO fromArray(Object[] o) {
      GettotalcustomerrewardsbyorderidDTO result = new GettotalcustomerrewardsbyorderidDTO();
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