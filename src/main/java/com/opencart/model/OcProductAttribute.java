package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_attribute")
@IdClass(value=OcProductAttributeId.class)
public class OcProductAttribute  {
  @Id
  @Column(name="attribute_id" , length=10)
  @NotNull
  private Integer attributeId;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="text" , length=65535)
  @NotNull
  private String text;

  public OcProductAttribute() {
  }

  public void setAttributeId( Integer value) {
    this.attributeId = value;
  }
  public Integer getAttributeId() {
    return this.attributeId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }

  public String toJson() {
      OcProductAttribute obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductAttribute fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductAttribute.class);
    }

  public static OcProductAttribute fromArray(Object[] o) {
      OcProductAttribute result = new OcProductAttribute();
      int i = 0;
        result.setAttributeId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setText((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductAttribute> list) {
      JsonArray array = new JsonArray();
      for (OcProductAttribute dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attributeId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.text)); ;
    return builder.toString();
  }
}