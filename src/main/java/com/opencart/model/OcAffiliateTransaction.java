package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_affiliate_transaction")
public class OcAffiliateTransaction  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="affiliate_transaction_id" , length=10)
  @NotNull
  private Integer affiliateTransactionId;

  @Basic
  @Column(name="amount" , length=15)
  @NotNull
  private Long amount;

  @Basic
  @Column(name="affiliate_id" , length=10)
  @NotNull
  private Integer affiliateId;

  @Basic
  @Column(name="description" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  public OcAffiliateTransaction() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAffiliateTransactionId( Integer value) {
    this.affiliateTransactionId = value;
  }
  public Integer getAffiliateTransactionId() {
    return this.affiliateTransactionId;
  }
  public void setAmount( Long value) {
    this.amount = value;
  }
  public Long getAmount() {
    return this.amount;
  }
  public void setAffiliateId( Integer value) {
    this.affiliateId = value;
  }
  public Integer getAffiliateId() {
    return this.affiliateId;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }

  public String toJson() {
      OcAffiliateTransaction obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAffiliateTransaction fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAffiliateTransaction.class);
    }

  public static OcAffiliateTransaction fromArray(Object[] o) {
      OcAffiliateTransaction result = new OcAffiliateTransaction();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setAffiliateTransactionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setAmount((Long)BeanUtils.getNullableValue(o[i++]));
        result.setAffiliateId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAffiliateTransaction> list) {
      JsonArray array = new JsonArray();
      for (OcAffiliateTransaction dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.affiliateTransactionId)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.affiliateId)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.orderId)); ;
    return builder.toString();
  }
}