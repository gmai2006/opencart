package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_option")
public class OcOrderOption  {
  @Basic
  @Column(name="order_product_id" , length=10)
  @NotNull
  private Integer orderProductId;

  @Basic
  @Column(name="product_option_id" , length=10)
  @NotNull
  private Integer productOptionId;

  @Id
  @Column(name="order_option_id" , length=10)
  @NotNull
  private Integer orderOptionId;

  @Basic
  @Column(name="product_option_value_id" , length=10)
  @NotNull
  private Integer productOptionValueId;

  @Basic
  @Column(name="name" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="type" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="value" , length=65535)
  @NotNull
  private String value;

  public OcOrderOption() {
  }

  public void setOrderProductId( Integer value) {
    this.orderProductId = value;
  }
  public Integer getOrderProductId() {
    return this.orderProductId;
  }
  public void setProductOptionId( Integer value) {
    this.productOptionId = value;
  }
  public Integer getProductOptionId() {
    return this.productOptionId;
  }
  public void setOrderOptionId( Integer value) {
    this.orderOptionId = value;
  }
  public Integer getOrderOptionId() {
    return this.orderOptionId;
  }
  public void setProductOptionValueId( Integer value) {
    this.productOptionValueId = value;
  }
  public Integer getProductOptionValueId() {
    return this.productOptionValueId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }

  public String toJson() {
      OcOrderOption obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderOption fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderOption.class);
    }

  public static OcOrderOption fromArray(Object[] o) {
      OcOrderOption result = new OcOrderOption();
      int i = 0;
        result.setOrderProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductOptionValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValue((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderOption> list) {
      JsonArray array = new JsonArray();
      for (OcOrderOption dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.orderProductId)); 
     builder.append(String.valueOf(this.productOptionId)); 
     builder.append(String.valueOf(this.orderOptionId)); 
     builder.append(String.valueOf(this.productOptionValueId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}