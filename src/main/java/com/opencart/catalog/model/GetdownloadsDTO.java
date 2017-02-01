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
public class GetdownloadsDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetdownloadsDTO.class);

  private Integer DownloadId ;
  private Integer OrderId ;
  private java.sql.Timestamp DateAdded ;
  private String Name ;
  private String Filename ;

  public void setDownloadId( Integer value) {
    this.DownloadId = value;
  }
  public Integer getDownloadId() {
    return this.DownloadId;
  }
  public void setOrderId( Integer value) {
    this.OrderId = value;
  }
  public Integer getOrderId() {
    return this.OrderId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.DateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.DateAdded;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }
  public void setFilename( String value) {
    this.Filename = value;
  }
  public String getFilename() {
    return this.Filename;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetdownloadsDTO fromArray(Object[] o) {
      GetdownloadsDTO result = new GetdownloadsDTO();
      int i = 0;
        result.setDownloadId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setFilename((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.DownloadId)); 
     builder.append(String.valueOf(this.OrderId)); 
     builder.append(String.valueOf(this.DateAdded)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.Filename)); ;
    return builder.toString();
  }
}