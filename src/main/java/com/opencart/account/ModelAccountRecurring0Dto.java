package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountRecurring0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountRecurring0Dto.class.getName());

  private Integer order_recurring_id ;
  private Integer order_id ;
  private String reference ;
  private Integer product_id ;
  private String product_name ;
  private Integer product_quantity ;
  private Integer recurring_id ;
  private String recurring_name ;
  private String recurring_description ;
  private String recurring_frequency ;
  private Short recurring_cycle ;
  private Short recurring_duration ;
  private java.math.BigDecimal recurring_price ;
  private Boolean trial ;
  private String trial_frequency ;
  private Short trial_cycle ;
  private Short trial_duration ;
  private java.math.BigDecimal trial_price ;
  private Byte status ;
  private java.sql.Timestamp date_added ;
  private String payment_method ;
  private String payment_code ;
  private String currency_code ;

  public Integer getOrder_recurring_id() {
    return this.order_recurring_id;
  }
  public void setOrder_recurring_id( Integer value) {
    this.order_recurring_id = value;
  }
  public Integer getOrder_id() {
    return this.order_id;
  }
  public void setOrder_id( Integer value) {
    this.order_id = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public Integer getProduct_id() {
    return this.product_id;
  }
  public void setProduct_id( Integer value) {
    this.product_id = value;
  }
  public String getProduct_name() {
    return this.product_name;
  }
  public void setProduct_name( String value) {
    this.product_name = value;
  }
  public Integer getProduct_quantity() {
    return this.product_quantity;
  }
  public void setProduct_quantity( Integer value) {
    this.product_quantity = value;
  }
  public Integer getRecurring_id() {
    return this.recurring_id;
  }
  public void setRecurring_id( Integer value) {
    this.recurring_id = value;
  }
  public String getRecurring_name() {
    return this.recurring_name;
  }
  public void setRecurring_name( String value) {
    this.recurring_name = value;
  }
  public String getRecurring_description() {
    return this.recurring_description;
  }
  public void setRecurring_description( String value) {
    this.recurring_description = value;
  }
  public String getRecurring_frequency() {
    return this.recurring_frequency;
  }
  public void setRecurring_frequency( String value) {
    this.recurring_frequency = value;
  }
  public Short getRecurring_cycle() {
    return this.recurring_cycle;
  }
  public void setRecurring_cycle( Short value) {
    this.recurring_cycle = value;
  }
  public Short getRecurring_duration() {
    return this.recurring_duration;
  }
  public void setRecurring_duration( Short value) {
    this.recurring_duration = value;
  }
  public java.math.BigDecimal getRecurring_price() {
    return this.recurring_price;
  }
  public void setRecurring_price( java.math.BigDecimal value) {
    this.recurring_price = value;
  }
  public Boolean getTrial() {
    return this.trial;
  }
  public void setTrial( Boolean value) {
    this.trial = value;
  }
  public String getTrial_frequency() {
    return this.trial_frequency;
  }
  public void setTrial_frequency( String value) {
    this.trial_frequency = value;
  }
  public Short getTrial_cycle() {
    return this.trial_cycle;
  }
  public void setTrial_cycle( Short value) {
    this.trial_cycle = value;
  }
  public Short getTrial_duration() {
    return this.trial_duration;
  }
  public void setTrial_duration( Short value) {
    this.trial_duration = value;
  }
  public java.math.BigDecimal getTrial_price() {
    return this.trial_price;
  }
  public void setTrial_price( java.math.BigDecimal value) {
    this.trial_price = value;
  }
  public Byte getStatus() {
    return this.status;
  }
  public void setStatus( Byte value) {
    this.status = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public String getPayment_method() {
    return this.payment_method;
  }
  public void setPayment_method( String value) {
    this.payment_method = value;
  }
  public String getPayment_code() {
    return this.payment_code;
  }
  public void setPayment_code( String value) {
    this.payment_code = value;
  }
  public String getCurrency_code() {
    return this.currency_code;
  }
  public void setCurrency_code( String value) {
    this.currency_code = value;
  }

  public static ModelAccountRecurring0Dto fromArray(Object[] o) {
    ModelAccountRecurring0Dto result = new ModelAccountRecurring0Dto();
    int i = 0;
    result.setOrder_recurring_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOrder_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setReference((String)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_name((String)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_quantity((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_name((String)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_description((String)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_frequency((String)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_cycle((Short)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_duration((Short)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_price((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setTrial((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_frequency((String)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_cycle((Short)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_duration((Short)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_price((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Byte)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_method((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_code((String)DaoUtils.getNullableValue(o[i++]));
    result.setCurrency_code((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.order_recurring_id)); 
    builder.append(String.valueOf(this.order_id)); 
    builder.append(String.valueOf(this.reference)); 
    builder.append(String.valueOf(this.product_id)); 
    builder.append(String.valueOf(this.product_name)); 
    builder.append(String.valueOf(this.product_quantity)); 
    builder.append(String.valueOf(this.recurring_id)); 
    builder.append(String.valueOf(this.recurring_name)); 
    builder.append(String.valueOf(this.recurring_description)); 
    builder.append(String.valueOf(this.recurring_frequency)); 
    builder.append(String.valueOf(this.recurring_cycle)); 
    builder.append(String.valueOf(this.recurring_duration)); 
    builder.append(String.valueOf(this.recurring_price)); 
    builder.append(String.valueOf(this.trial)); 
    builder.append(String.valueOf(this.trial_frequency)); 
    builder.append(String.valueOf(this.trial_cycle)); 
    builder.append(String.valueOf(this.trial_duration)); 
    builder.append(String.valueOf(this.trial_price)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.date_added)); 
    builder.append(String.valueOf(this.payment_method)); 
    builder.append(String.valueOf(this.payment_code)); 
    builder.append(String.valueOf(this.currency_code)); ;
    return builder.toString();
  }
}