package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_product")
public class OcOrderProduct  {
  @Basic
  @Column(name="reward" , length=10)
  @NotNull
  private Integer reward;

  @Basic
  @Column(name="total" , length=15)
  @NotNull
  private Long total;

  @Id
  @Column(name="order_product_id" , length=10)
  @NotNull
  private Integer orderProductId;

  @Basic
  @Column(name="quantity" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="price" , length=15)
  @NotNull
  private Long price;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="name" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="model" , length=64)
  @NotNull
  private String model;

  @Basic
  @Column(name="tax" , length=15)
  @NotNull
  private Long tax;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  public OcOrderProduct() {
  }

  public void setReward( Integer value) {
    this.reward = value;
  }
  public Integer getReward() {
    return this.reward;
  }
  public void setTotal( Long value) {
    this.total = value;
  }
  public Long getTotal() {
    return this.total;
  }
  public void setOrderProductId( Integer value) {
    this.orderProductId = value;
  }
  public Integer getOrderProductId() {
    return this.orderProductId;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
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
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setTax( Long value) {
    this.tax = value;
  }
  public Long getTax() {
    return this.tax;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }

  public String toJson() {
      OcOrderProduct obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderProduct fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderProduct.class);
    }

  public static OcOrderProduct fromArray(Object[] o) {
      OcOrderProduct result = new OcOrderProduct();
      int i = 0;
        result.setReward((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTotal((Long)BeanUtils.getNullableValue(o[i++]));
        result.setOrderProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setQuantity((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPrice((Long)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setModel((String)BeanUtils.getNullableValue(o[i++]));
        result.setTax((Long)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderProduct> list) {
      JsonArray array = new JsonArray();
      for (OcOrderProduct dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.reward)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.orderProductId)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.model)); 
     builder.append(String.valueOf(this.tax)); 
     builder.append(String.valueOf(this.orderId)); ;
    return builder.toString();
  }
}