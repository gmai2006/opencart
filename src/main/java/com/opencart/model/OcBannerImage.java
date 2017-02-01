package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_banner_image")
public class OcBannerImage  {
  @Basic
  @Column(name="image" , length=255)
  @NotNull
  private String image;

  @Id
  @Column(name="banner_image_id" , length=10)
  @NotNull
  private Integer bannerImageId;

  @Basic
  @Column(name="banner_id" , length=10)
  @NotNull
  private Integer bannerId;

  @Basic
  @Column(name="link" , length=255)
  @NotNull
  private String link;

  @Basic
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="title" , length=64)
  @NotNull
  private String title;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcBannerImage() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setBannerImageId( Integer value) {
    this.bannerImageId = value;
  }
  public Integer getBannerImageId() {
    return this.bannerImageId;
  }
  public void setBannerId( Integer value) {
    this.bannerId = value;
  }
  public Integer getBannerId() {
    return this.bannerId;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcBannerImage obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcBannerImage fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcBannerImage.class);
    }

  public static OcBannerImage fromArray(Object[] o) {
      OcBannerImage result = new OcBannerImage();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setBannerImageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setBannerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLink((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTitle((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcBannerImage> list) {
      JsonArray array = new JsonArray();
      for (OcBannerImage dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.bannerImageId)); 
     builder.append(String.valueOf(this.bannerId)); 
     builder.append(String.valueOf(this.link)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}