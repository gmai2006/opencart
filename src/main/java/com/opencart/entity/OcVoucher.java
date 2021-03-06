
package com.opencart.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_voucher")
public class OcVoucher  {
  @Id
  @Column(name="\"voucher_id\"" , length=10)
  @NotNull
  private Integer voucher_id;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"code\"" , length=10)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"from_name\"" , length=64)
  @NotNull
  private String from_name;

  @Basic
  @Column(name="\"from_email\"" , length=96)
  @NotNull
  private String from_email;

  @Basic
  @Column(name="\"to_name\"" , length=64)
  @NotNull
  private String to_name;

  @Basic
  @Column(name="\"to_email\"" , length=96)
  @NotNull
  private String to_email;

  @Basic
  @Column(name="\"voucher_theme_id\"" , length=10)
  @NotNull
  private Integer voucher_theme_id;

  @Basic
  @Column(name="\"message\"" , length=65535)
  @NotNull
  private String message;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private java.math.BigDecimal amount;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcVoucher() {
  }

  public void setVoucherId( Integer value) {
    this.voucher_id = value;
  }
  public Integer getVoucherId() {
    return this.voucher_id;
  }
  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setFromName( String value) {
    this.from_name = value;
  }
  public String getFromName() {
    return this.from_name;
  }
  public void setFromEmail( String value) {
    this.from_email = value;
  }
  public String getFromEmail() {
    return this.from_email;
  }
  public void setToName( String value) {
    this.to_name = value;
  }
  public String getToName() {
    return this.to_name;
  }
  public void setToEmail( String value) {
    this.to_email = value;
  }
  public String getToEmail() {
    return this.to_email;
  }
  public void setVoucherThemeId( Integer value) {
    this.voucher_theme_id = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucher_theme_id;
  }
  public void setMessage( String value) {
    this.message = value;
  }
  public String getMessage() {
    return this.message;
  }
  public void setAmount( java.math.BigDecimal value) {
    this.amount = value;
  }
  public java.math.BigDecimal getAmount() {
    return this.amount;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.voucher_id)); 
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.from_name)); 
     builder.append(String.valueOf(this.from_email)); 
     builder.append(String.valueOf(this.to_name)); 
     builder.append(String.valueOf(this.to_email)); 
     builder.append(String.valueOf(this.voucher_theme_id)); 
     builder.append(String.valueOf(this.message)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}