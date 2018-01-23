package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountReturn0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountReturn0Dto.class.getName());

  private Integer return_id ;
  private Integer order_id ;
  private String firstname ;
  private String lastname ;
  private String status ;
  private java.sql.Timestamp date_added ;

  public Integer getReturn_id() {
    return this.return_id;
  }
  public void setReturn_id( Integer value) {
    this.return_id = value;
  }
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

  public static ModelAccountReturn0Dto fromArray(Object[] o) {
    ModelAccountReturn0Dto result = new ModelAccountReturn0Dto();
    int i = 0;
    result.setReturn_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOrder_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setFirstname((String)DaoUtils.getNullableValue(o[i++]));
    result.setLastname((String)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((String)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.return_id)); 
    builder.append(String.valueOf(this.order_id)); 
    builder.append(String.valueOf(this.firstname)); 
    builder.append(String.valueOf(this.lastname)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}