package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_cart")
public class OcCart  {
  @Id
  @Column(name="cart_id" , length=10)
  @NotNull
  private Integer cartId;

  @Basic
  @Column(name="api_id" , length=10)
  @NotNull
  private Integer apiId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="quantity" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="recurring_id" , length=10)
  @NotNull
  private Integer recurringId;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="session_id" , length=32)
  @NotNull
  private String sessionId;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="option" , length=65535)
  @NotNull
  private String option;

  public OcCart() {
  }

  public void setCartId( Integer value) {
    this.cartId = value;
  }
  public Integer getCartId() {
    return this.cartId;
  }
  public void setApiId( Integer value) {
    this.apiId = value;
  }
  public Integer getApiId() {
    return this.apiId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setRecurringId( Integer value) {
    this.recurringId = value;
  }
  public Integer getRecurringId() {
    return this.recurringId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setSessionId( String value) {
    this.sessionId = value;
  }
  public String getSessionId() {
    return this.sessionId;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setOption( String value) {
    this.option = value;
  }
  public String getOption() {
    return this.option;
  }

  public String toJson() {
      OcCart obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCart fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCart.class);
    }

  public static OcCart fromArray(Object[] o) {
      OcCart result = new OcCart();
      int i = 0;
        result.setCartId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setApiId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setQuantity((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setRecurringId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSessionId((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOption((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCart> list) {
      JsonArray array = new JsonArray();
      for (OcCart dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.cartId)); 
     builder.append(String.valueOf(this.apiId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.recurringId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.sessionId)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.option)); ;
    return builder.toString();
  }
}