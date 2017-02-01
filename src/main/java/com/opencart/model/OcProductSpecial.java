package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_special")
public class OcProductSpecial  {
  @Basic
  @Column(name="date_start" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  //@XmlJavaTypeAdapter(SqlDateAdapter.class)
  private java.util.Date dateStart;

  @Basic
  @Column(name="price" , length=15)
  @NotNull
  private Long price;

  @Id
  @Column(name="product_special_id" , length=10)
  @NotNull
  private Integer productSpecialId;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

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

  public OcProductSpecial() {
  }

  public void setDateStart( java.util.Date value) {
    this.dateStart = value;
  }
  public java.util.Date getDateStart() {
    return this.dateStart;
  }
  public void setPrice( Long value) {
    this.price = value;
  }
  public Long getPrice() {
    return this.price;
  }
  public void setProductSpecialId( Integer value) {
    this.productSpecialId = value;
  }
  public Integer getProductSpecialId() {
    return this.productSpecialId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
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
      OcProductSpecial obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductSpecial fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductSpecial.class);
    }

  public static OcProductSpecial fromArray(Object[] o) {
      OcProductSpecial result = new OcProductSpecial();
      int i = 0;
        result.setDateStart((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setPrice((Long)BeanUtils.getNullableValue(o[i++]));
        result.setProductSpecialId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateEnd((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setPriority((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductSpecial> list) {
      JsonArray array = new JsonArray();
      for (OcProductSpecial dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateStart)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productSpecialId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.dateEnd)); 
     builder.append(String.valueOf(this.priority)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}