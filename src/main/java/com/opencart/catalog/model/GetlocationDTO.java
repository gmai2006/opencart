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
public class GetlocationDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetlocationDTO.class);

  private Integer LocationId ;
  private String Name ;
  private String Address ;
  private String Geocode ;
  private String Telephone ;
  private String Fax ;
  private String Image ;
  private String Open ;
  private String Comment ;

  public void setLocationId( Integer value) {
    this.LocationId = value;
  }
  public Integer getLocationId() {
    return this.LocationId;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }
  public void setAddress( String value) {
    this.Address = value;
  }
  public String getAddress() {
    return this.Address;
  }
  public void setGeocode( String value) {
    this.Geocode = value;
  }
  public String getGeocode() {
    return this.Geocode;
  }
  public void setTelephone( String value) {
    this.Telephone = value;
  }
  public String getTelephone() {
    return this.Telephone;
  }
  public void setFax( String value) {
    this.Fax = value;
  }
  public String getFax() {
    return this.Fax;
  }
  public void setImage( String value) {
    this.Image = value;
  }
  public String getImage() {
    return this.Image;
  }
  public void setOpen( String value) {
    this.Open = value;
  }
  public String getOpen() {
    return this.Open;
  }
  public void setComment( String value) {
    this.Comment = value;
  }
  public String getComment() {
    return this.Comment;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetlocationDTO fromArray(Object[] o) {
      GetlocationDTO result = new GetlocationDTO();
      int i = 0;
        result.setLocationId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddress((String)BeanUtils.getNullableValue(o[i++]));
        result.setGeocode((String)BeanUtils.getNullableValue(o[i++]));
        result.setTelephone((String)BeanUtils.getNullableValue(o[i++]));
        result.setFax((String)BeanUtils.getNullableValue(o[i++]));
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setOpen((String)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.LocationId)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.Address)); 
     builder.append(String.valueOf(this.Geocode)); 
     builder.append(String.valueOf(this.Telephone)); 
     builder.append(String.valueOf(this.Fax)); 
     builder.append(String.valueOf(this.Image)); 
     builder.append(String.valueOf(this.Open)); 
     builder.append(String.valueOf(this.Comment)); ;
    return builder.toString();
  }
}