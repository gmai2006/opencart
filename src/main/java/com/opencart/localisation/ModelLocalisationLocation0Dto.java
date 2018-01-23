package com.opencart.localisation;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelLocalisationLocation0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelLocalisationLocation0Dto.class.getName());

  private Integer location_id ;
  private String name ;
  private String address ;
  private String geocode ;
  private String telephone ;
  private String fax ;
  private String image ;
  private String open ;
  private String comment ;

  public Integer getLocation_id() {
    return this.location_id;
  }
  public void setLocation_id( Integer value) {
    this.location_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getGeocode() {
    return this.geocode;
  }
  public void setGeocode( String value) {
    this.geocode = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getOpen() {
    return this.open;
  }
  public void setOpen( String value) {
    this.open = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }

  public static ModelLocalisationLocation0Dto fromArray(Object[] o) {
    ModelLocalisationLocation0Dto result = new ModelLocalisationLocation0Dto();
    int i = 0;
    result.setLocation_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setAddress((String)DaoUtils.getNullableValue(o[i++]));
    result.setGeocode((String)DaoUtils.getNullableValue(o[i++]));
    result.setTelephone((String)DaoUtils.getNullableValue(o[i++]));
    result.setFax((String)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setOpen((String)DaoUtils.getNullableValue(o[i++]));
    result.setComment((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.location_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.address)); 
    builder.append(String.valueOf(this.geocode)); 
    builder.append(String.valueOf(this.telephone)); 
    builder.append(String.valueOf(this.fax)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.open)); 
    builder.append(String.valueOf(this.comment)); ;
    return builder.toString();
  }
}