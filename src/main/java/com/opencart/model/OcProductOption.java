package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_option")
public class OcProductOption  {
  @Id
  @Column(name="product_option_id" , length=10)
  @NotNull
  private Integer productOptionId;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="option_id" , length=10)
  @NotNull
  private Integer optionId;

  @Basic
  @Column(name="value" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="required" )
  @NotNull
  private Boolean required;

  public OcProductOption() {
  }

  public void setProductOptionId( Integer value) {
    this.productOptionId = value;
  }
  public Integer getProductOptionId() {
    return this.productOptionId;
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
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRequired() {
    return this.required;
  }

  public String toJson() {
      OcProductOption obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductOption fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductOption.class);
    }

  public static OcProductOption fromArray(Object[] o) {
      OcProductOption result = new OcProductOption();
      int i = 0;
        result.setProductOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValue((String)BeanUtils.getNullableValue(o[i++]));
        result.setRequired((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductOption> list) {
      JsonArray array = new JsonArray();
      for (OcProductOption dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.productOptionId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.required)); ;
    return builder.toString();
  }
}