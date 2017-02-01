package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_option_value")
public class OcProductOptionValue  {
  @Basic
  @Column(name="quantity" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="option_value_id" , length=10)
  @NotNull
  private Integer optionValueId;

  @Id
  @Column(name="product_option_value_id" , length=10)
  @NotNull
  private Integer productOptionValueId;

  @Basic
  @Column(name="subtract" )
  @NotNull
  private Boolean subtract;

  @Basic
  @Column(name="price_prefix" , length=1)
  @NotNull
  private String pricePrefix;

  @Basic
  @Column(name="weight" , length=15)
  @NotNull
  private Long weight;

  @Basic
  @Column(name="weight_prefix" , length=1)
  @NotNull
  private String weightPrefix;

  @Basic
  @Column(name="points_prefix" , length=1)
  @NotNull
  private String pointsPrefix;

  @Basic
  @Column(name="points" , length=10)
  @NotNull
  private Integer points;

  @Basic
  @Column(name="product_option_id" , length=10)
  @NotNull
  private Integer productOptionId;

  @Basic
  @Column(name="price" , length=15)
  @NotNull
  private Long price;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="option_id" , length=10)
  @NotNull
  private Integer optionId;

  public OcProductOptionValue() {
  }

  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setOptionValueId( Integer value) {
    this.optionValueId = value;
  }
  public Integer getOptionValueId() {
    return this.optionValueId;
  }
  public void setProductOptionValueId( Integer value) {
    this.productOptionValueId = value;
  }
  public Integer getProductOptionValueId() {
    return this.productOptionValueId;
  }
  public void setSubtract( Boolean value) {
    this.subtract = value;
  }
  public Boolean getSubtract() {
    return this.subtract;
  }
  public void setPricePrefix( String value) {
    this.pricePrefix = value;
  }
  public String getPricePrefix() {
    return this.pricePrefix;
  }
  public void setWeight( Long value) {
    this.weight = value;
  }
  public Long getWeight() {
    return this.weight;
  }
  public void setWeightPrefix( String value) {
    this.weightPrefix = value;
  }
  public String getWeightPrefix() {
    return this.weightPrefix;
  }
  public void setPointsPrefix( String value) {
    this.pointsPrefix = value;
  }
  public String getPointsPrefix() {
    return this.pointsPrefix;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }
  public void setProductOptionId( Integer value) {
    this.productOptionId = value;
  }
  public Integer getProductOptionId() {
    return this.productOptionId;
  }
  public void setPrice( Long value) {
    this.price = value;
  }
  public Long getPrice() {
    return this.price;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setOptionId( Integer value) {
    this.optionId = value;
  }
  public Integer getOptionId() {
    return this.optionId;
  }

  public String toJson() {
      OcProductOptionValue obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductOptionValue fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductOptionValue.class);
    }

  public static OcProductOptionValue fromArray(Object[] o) {
      OcProductOptionValue result = new OcProductOptionValue();
      int i = 0;
        result.setQuantity((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOptionValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductOptionValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSubtract((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setPricePrefix((String)BeanUtils.getNullableValue(o[i++]));
        result.setWeight((Long)BeanUtils.getNullableValue(o[i++]));
        result.setWeightPrefix((String)BeanUtils.getNullableValue(o[i++]));
        result.setPointsPrefix((String)BeanUtils.getNullableValue(o[i++]));
        result.setPoints((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPrice((Long)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductOptionValue> list) {
      JsonArray array = new JsonArray();
      for (OcProductOptionValue dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.optionValueId)); 
     builder.append(String.valueOf(this.productOptionValueId)); 
     builder.append(String.valueOf(this.subtract)); 
     builder.append(String.valueOf(this.pricePrefix)); 
     builder.append(String.valueOf(this.weight)); 
     builder.append(String.valueOf(this.weightPrefix)); 
     builder.append(String.valueOf(this.pointsPrefix)); 
     builder.append(String.valueOf(this.points)); 
     builder.append(String.valueOf(this.productOptionId)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.optionId)); ;
    return builder.toString();
  }
}