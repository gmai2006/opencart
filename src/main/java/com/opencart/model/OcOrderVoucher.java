package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_voucher")
public class OcOrderVoucher  {
  @Basic
  @Column(name="to_email" , length=96)
  @NotNull
  private String toEmail;

  @Basic
  @Column(name="voucher_theme_id" , length=10)
  @NotNull
  private Integer voucherThemeId;

  @Basic
  @Column(name="amount" , length=15)
  @NotNull
  private Long amount;

  @Basic
  @Column(name="code" , length=10)
  @NotNull
  private String code;

  @Basic
  @Column(name="from_email" , length=96)
  @NotNull
  private String fromEmail;

  @Id
  @Column(name="order_voucher_id" , length=10)
  @NotNull
  private Integer orderVoucherId;

  @Basic
  @Column(name="to_name" , length=64)
  @NotNull
  private String toName;

  @Basic
  @Column(name="voucher_id" , length=10)
  @NotNull
  private Integer voucherId;

  @Basic
  @Column(name="description" , length=255)
  @NotNull
  private String description;

  @Basic
  @Column(name="from_name" , length=64)
  @NotNull
  private String fromName;

  @Basic
  @Column(name="message" , length=65535)
  @NotNull
  private String message;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  public OcOrderVoucher() {
  }

  public void setToEmail( String value) {
    this.toEmail = value;
  }
  public String getToEmail() {
    return this.toEmail;
  }
  public void setVoucherThemeId( Integer value) {
    this.voucherThemeId = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucherThemeId;
  }
  public void setAmount( Long value) {
    this.amount = value;
  }
  public Long getAmount() {
    return this.amount;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setFromEmail( String value) {
    this.fromEmail = value;
  }
  public String getFromEmail() {
    return this.fromEmail;
  }
  public void setOrderVoucherId( Integer value) {
    this.orderVoucherId = value;
  }
  public Integer getOrderVoucherId() {
    return this.orderVoucherId;
  }
  public void setToName( String value) {
    this.toName = value;
  }
  public String getToName() {
    return this.toName;
  }
  public void setVoucherId( Integer value) {
    this.voucherId = value;
  }
  public Integer getVoucherId() {
    return this.voucherId;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setFromName( String value) {
    this.fromName = value;
  }
  public String getFromName() {
    return this.fromName;
  }
  public void setMessage( String value) {
    this.message = value;
  }
  public String getMessage() {
    return this.message;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }

  public String toJson() {
      OcOrderVoucher obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderVoucher fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderVoucher.class);
    }

  public static OcOrderVoucher fromArray(Object[] o) {
      OcOrderVoucher result = new OcOrderVoucher();
      int i = 0;
        result.setToEmail((String)BeanUtils.getNullableValue(o[i++]));
        result.setVoucherThemeId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setAmount((Long)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setFromEmail((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderVoucherId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setToName((String)BeanUtils.getNullableValue(o[i++]));
        result.setVoucherId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setFromName((String)BeanUtils.getNullableValue(o[i++]));
        result.setMessage((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderVoucher> list) {
      JsonArray array = new JsonArray();
      for (OcOrderVoucher dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.toEmail)); 
     builder.append(String.valueOf(this.voucherThemeId)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.fromEmail)); 
     builder.append(String.valueOf(this.orderVoucherId)); 
     builder.append(String.valueOf(this.toName)); 
     builder.append(String.valueOf(this.voucherId)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.fromName)); 
     builder.append(String.valueOf(this.message)); 
     builder.append(String.valueOf(this.orderId)); ;
    return builder.toString();
  }
}