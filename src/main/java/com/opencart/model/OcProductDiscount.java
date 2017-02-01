package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_discount")
public class OcProductDiscount  {
  @Basic
  @Column(name="date_start" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  //@XmlJavaTypeAdapter(SqlDateAdapter.class)
  private java.util.Date dateStart;

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

  @Id
  @Column(name="product_discount_id" , length=10)
  @NotNull
  private Integer productDiscountId;

  @Basic
  @Column(name="date_end" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  //@XmlJavaTypeAdapter(SqlDateAdapter.class)
  private java.util.Date dateEnd;

  @Basic
  @Column(name="priority" , length=10)
  @NotNull
  private Integer priority;

  @Basic
  @Column(name="customer_group_id" , length=10)
  @NotNull
  private Integer customerGroupId;

  public OcProductDiscount() {
  }

  public void setDateStart( java.util.Date value) {
    this.dateStart = value;
  }
  public java.util.Date getDateStart() {
    return this.dateStart;
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
  public void setProductDiscountId( Integer value) {
    this.productDiscountId = value;
  }
  public Integer getProductDiscountId() {
    return this.productDiscountId;
  }
  public void setDateEnd( java.util.Date value) {
    this.dateEnd = value;
  }
  public java.util.Date getDateEnd() {
    return this.dateEnd;
  }
  public void setPriority( Integer value) {
    this.priority = value;
  }
  public Integer getPriority() {
    return this.priority;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public String toJson() {
      OcProductDiscount obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductDiscount fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductDiscount.class);
    }

  public static OcProductDiscount fromArray(Object[] o) {
      OcProductDiscount result = new OcProductDiscount();
      int i = 0;
        result.setDateStart((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setQuantity((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPrice((Long)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductDiscountId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateEnd((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setPriority((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductDiscount> list) {
      JsonArray array = new JsonArray();
      for (OcProductDiscount dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateStart)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.productDiscountId)); 
     builder.append(String.valueOf(this.dateEnd)); 
     builder.append(String.valueOf(this.priority)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}