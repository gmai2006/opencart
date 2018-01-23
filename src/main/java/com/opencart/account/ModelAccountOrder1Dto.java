package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountOrder1Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountOrder1Dto.class.getName());

  private Integer order_id ;
  private String firstname ;
  private String lastname ;
  private String status ;
  private java.sql.Timestamp date_added ;
  private java.math.BigDecimal total ;
  private String currency_code ;
  private java.math.BigDecimal currency_value ;

  public Integer getOrder_id() {
    return this.order_id;
  }
  public void setOrder_id( Integer value) {
    this.order_id = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.math.BigDecimal getTotal() {
    return this.total;
  }
  public void setTotal( java.math.BigDecimal value) {
    this.total = value;
  }
  public String getCurrency_code() {
    return this.currency_code;
  }
  public void setCurrency_code( String value) {
    this.currency_code = value;
  }
  public java.math.BigDecimal getCurrency_value() {
    return this.currency_value;
  }
  public void setCurrency_value( java.math.BigDecimal value) {
    this.currency_value = value;
  }

  public static ModelAccountOrder1Dto fromArray(Object[] o) {
    ModelAccountOrder1Dto result = new ModelAccountOrder1Dto();
    int i = 0;
    result.setOrder_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setFirstname((String)DaoUtils.getNullableValue(o[i++]));
    result.setLastname((String)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((String)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setTotal((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setCurrency_code((String)DaoUtils.getNullableValue(o[i++]));
    result.setCurrency_value((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.order_id)); 
    builder.append(String.valueOf(this.firstname)); 
    builder.append(String.valueOf(this.lastname)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.date_added)); 
    builder.append(String.valueOf(this.total)); 
    builder.append(String.valueOf(this.currency_code)); 
    builder.append(String.valueOf(this.currency_value)); ;
    return builder.toString();
  }
}