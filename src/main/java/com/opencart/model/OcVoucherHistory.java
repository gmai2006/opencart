package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_voucher_history")
public class OcVoucherHistory  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="amount" , length=15)
  @NotNull
  private Long amount;

  @Basic
  @Column(name="voucher_id" , length=10)
  @NotNull
  private Integer voucherId;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  @Id
  @Column(name="voucher_history_id" , length=10)
  @NotNull
  private Integer voucherHistoryId;

  public OcVoucherHistory() {
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
  public void setVoucherId( Integer value) {
    this.voucherId = value;
  }
  public Integer getVoucherId() {
    return this.voucherId;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setVoucherHistoryId( Integer value) {
    this.voucherHistoryId = value;
  }
  public Integer getVoucherHistoryId() {
    return this.voucherHistoryId;
  }

  public String toJson() {
      OcVoucherHistory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcVoucherHistory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcVoucherHistory.class);
    }

  public static OcVoucherHistory fromArray(Object[] o) {
      OcVoucherHistory result = new OcVoucherHistory();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setAmount((Long)BeanUtils.getNullableValue(o[i++]));
        result.setVoucherId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setVoucherHistoryId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcVoucherHistory> list) {
      JsonArray array = new JsonArray();
      for (OcVoucherHistory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.voucherId)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.voucherHistoryId)); ;
    return builder.toString();
  }
}