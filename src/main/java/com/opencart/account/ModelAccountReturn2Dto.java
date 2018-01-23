package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountReturn2Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountReturn2Dto.class.getName());

  private Integer return_id ;
  private Integer order_id ;
  private String firstname ;
  private String lastname ;
  private String email ;
  private String telephone ;
  private String product ;
  private String model ;
  private Integer quantity ;
  private Boolean opened ;
  private String reason ;
  private String action ;
  private String status ;
  private String comment ;
  private java.util.Date date_ordered ;
  private java.sql.Timestamp date_added ;
  private java.sql.Timestamp date_modified ;

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
  public String getEmail() {
    return this.email;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getProduct() {
    return this.product;
  }
  public void setProduct( String value) {
    this.product = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Boolean getOpened() {
    return this.opened;
  }
  public void setOpened( Boolean value) {
    this.opened = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public java.util.Date getDate_ordered() {
    return this.date_ordered;
  }
  public void setDate_ordered( java.util.Date value) {
    this.date_ordered = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDate_modified() {
    return this.date_modified;
  }
  public void setDate_modified( java.sql.Timestamp value) {
    this.date_modified = value;
  }

  public static ModelAccountReturn2Dto fromArray(Object[] o) {
    ModelAccountReturn2Dto result = new ModelAccountReturn2Dto();
    int i = 0;
    result.setReturn_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOrder_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setFirstname((String)DaoUtils.getNullableValue(o[i++]));
    result.setLastname((String)DaoUtils.getNullableValue(o[i++]));
    result.setEmail((String)DaoUtils.getNullableValue(o[i++]));
    result.setTelephone((String)DaoUtils.getNullableValue(o[i++]));
    result.setProduct((String)DaoUtils.getNullableValue(o[i++]));
    result.setModel((String)DaoUtils.getNullableValue(o[i++]));
    result.setQuantity((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOpened((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setReason((String)DaoUtils.getNullableValue(o[i++]));
    result.setAction((String)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((String)DaoUtils.getNullableValue(o[i++]));
    result.setComment((String)DaoUtils.getNullableValue(o[i++]));
    result.setDate_ordered((java.util.Date)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setDate_modified((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.return_id)); 
    builder.append(String.valueOf(this.order_id)); 
    builder.append(String.valueOf(this.firstname)); 
    builder.append(String.valueOf(this.lastname)); 
    builder.append(String.valueOf(this.email)); 
    builder.append(String.valueOf(this.telephone)); 
    builder.append(String.valueOf(this.product)); 
    builder.append(String.valueOf(this.model)); 
    builder.append(String.valueOf(this.quantity)); 
    builder.append(String.valueOf(this.opened)); 
    builder.append(String.valueOf(this.reason)); 
    builder.append(String.valueOf(this.action)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.comment)); 
    builder.append(String.valueOf(this.date_ordered)); 
    builder.append(String.valueOf(this.date_added)); 
    builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}