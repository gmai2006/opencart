package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_image")
public class OcProductImage  {
  @Basic
  @Column(name="image" , length=255)
  private String image;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Id
  @Column(name="product_image_id" , length=10)
  @NotNull
  private Integer productImageId;

  public OcProductImage() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setProductImageId( Integer value) {
    this.productImageId = value;
  }
  public Integer getProductImageId() {
    return this.productImageId;
  }

  public String toJson() {
      OcProductImage obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductImage fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductImage.class);
    }

  public static OcProductImage fromArray(Object[] o) {
      OcProductImage result = new OcProductImage();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductImageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductImage> list) {
      JsonArray array = new JsonArray();
      for (OcProductImage dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.productImageId)); ;
    return builder.toString();
  }
}