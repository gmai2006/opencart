package com.opencart.design;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelDesignBanner0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelDesignBanner0Dto.class.getName());

  private Integer banner_id ;
  private String name ;
  private Boolean status ;
  private Integer banner_image_id ;
  private Integer banner_id0 ;
  private Integer language_id ;
  private String title ;
  private String link ;
  private String image ;
  private Integer sort_order ;

  public Integer getBanner_id() {
    return this.banner_id;
  }
  public void setBanner_id( Integer value) {
    this.banner_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Integer getBanner_image_id() {
    return this.banner_image_id;
  }
  public void setBanner_image_id( Integer value) {
    this.banner_image_id = value;
  }
  public Integer getBanner_id0() {
    return this.banner_id0;
  }
  public void setBanner_id0( Integer value) {
    this.banner_id0 = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }

  public static ModelDesignBanner0Dto fromArray(Object[] o) {
    ModelDesignBanner0Dto result = new ModelDesignBanner0Dto();
    int i = 0;
    result.setBanner_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setBanner_image_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setBanner_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTitle((String)DaoUtils.getNullableValue(o[i++]));
    result.setLink((String)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.banner_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.banner_image_id)); 
    builder.append(String.valueOf(this.banner_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.title)); 
    builder.append(String.valueOf(this.link)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}