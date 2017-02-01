package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_recurring_transaction")
public class OcOrderRecurringTransaction  {
  @Basic
  @Column(name="reference" , length=255)
  @NotNull
  private String reference;

  @Basic
  @Column(name="order_recurring_id" , length=10)
  @NotNull
  private Integer orderRecurringId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="amount" , length=10)
  @NotNull
  private Long amount;

  @Id
  @Column(name="order_recurring_transaction_id" , length=10)
  @NotNull
  private Integer orderRecurringTransactionId;

  @Basic
  @Column(name="type" , length=255)
  @NotNull
  private String type;

  public OcOrderRecurringTransaction() {
  }

  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setOrderRecurringId( Integer value) {
    this.orderRecurringId = value;
  }
  public Integer getOrderRecurringId() {
    return this.orderRecurringId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAmount( Long value) {
    this.amount = value;
  }
  public Long getAmount() {
    return this.amount;
  }
  public void setOrderRecurringTransactionId( Integer value) {
    this.orderRecurringTransactionId = value;
  }
  public Integer getOrderRecurringTransactionId() {
    return this.orderRecurringTransactionId;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }

  public String toJson() {
      OcOrderRecurringTransaction obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderRecurringTransaction fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderRecurringTransaction.class);
    }

  public static OcOrderRecurringTransaction fromArray(Object[] o) {
      OcOrderRecurringTransaction result = new OcOrderRecurringTransaction();
      int i = 0;
        result.setReference((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderRecurringId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setAmount((Long)BeanUtils.getNullableValue(o[i++]));
        result.setOrderRecurringTransactionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderRecurringTransaction> list) {
      JsonArray array = new JsonArray();
      for (OcOrderRecurringTransaction dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.reference)); 
     builder.append(String.valueOf(this.orderRecurringId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.orderRecurringTransactionId)); 
     builder.append(String.valueOf(this.type)); ;
    return builder.toString();
  }
}