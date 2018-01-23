package com.opencart.extension.total;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelExtensionTotalVoucher0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelExtensionTotalVoucher0Dto.class.getName());

  private Integer voucher_id ;
  private Integer order_id ;
  private String code ;
  private String from_name ;
  private String from_email ;
  private String to_name ;
  private String to_email ;
  private Integer voucher_theme_id ;
  private String message ;
  private java.math.BigDecimal amount ;
  private Boolean status ;
  private java.sql.Timestamp date_added ;
  private Integer voucher_theme_id0 ;
  private String image ;
  private Integer voucher_theme_id01 ;
  private Integer language_id ;
  private String name ;
  private String theme ;

  public Integer getVoucher_id() {
    return this.voucher_id;
  }
  public void setVoucher_id( Integer value) {
    this.voucher_id = value;
  }
  public Integer getOrder_id() {
    return this.order_id;
  }
  public void setOrder_id( Integer value) {
    this.order_id = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getFrom_name() {
    return this.from_name;
  }
  public void setFrom_name( String value) {
    this.from_name = value;
  }
  public String getFrom_email() {
    return this.from_email;
  }
  public void setFrom_email( String value) {
    this.from_email = value;
  }
  public String getTo_name() {
    return this.to_name;
  }
  public void setTo_name( String value) {
    this.to_name = value;
  }
  public String getTo_email() {
    return this.to_email;
  }
  public void setTo_email( String value) {
    this.to_email = value;
  }
  public Integer getVoucher_theme_id() {
    return this.voucher_theme_id;
  }
  public void setVoucher_theme_id( Integer value) {
    this.voucher_theme_id = value;
  }
  public String getMessage() {
    return this.message;
  }
  public void setMessage( String value) {
    this.message = value;
  }
  public java.math.BigDecimal getAmount() {
    return this.amount;
  }
  public void setAmount( java.math.BigDecimal value) {
    this.amount = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public Integer getVoucher_theme_id0() {
    return this.voucher_theme_id0;
  }
  public void setVoucher_theme_id0( Integer value) {
    this.voucher_theme_id0 = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public Integer getVoucher_theme_id01() {
    return this.voucher_theme_id01;
  }
  public void setVoucher_theme_id01( Integer value) {
    this.voucher_theme_id01 = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getTheme() {
    return this.theme;
  }
  public void setTheme( String value) {
    this.theme = value;
  }

  public static ModelExtensionTotalVoucher0Dto fromArray(Object[] o) {
    ModelExtensionTotalVoucher0Dto result = new ModelExtensionTotalVoucher0Dto();
    int i = 0;
    result.setVoucher_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOrder_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCode((String)DaoUtils.getNullableValue(o[i++]));
    result.setFrom_name((String)DaoUtils.getNullableValue(o[i++]));
    result.setFrom_email((String)DaoUtils.getNullableValue(o[i++]));
    result.setTo_name((String)DaoUtils.getNullableValue(o[i++]));
    result.setTo_email((String)DaoUtils.getNullableValue(o[i++]));
    result.setVoucher_theme_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setMessage((String)DaoUtils.getNullableValue(o[i++]));
    result.setAmount((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setVoucher_theme_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setVoucher_theme_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setTheme((String)DaoUtils.getNullableValue(o[i++]));
    return result;
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
    builder.append(String.valueOf(this.date_added)); 
    builder.append(String.valueOf(this.voucher_theme_id0)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.voucher_theme_id01)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.theme)); ;
    return builder.toString();
  }
}