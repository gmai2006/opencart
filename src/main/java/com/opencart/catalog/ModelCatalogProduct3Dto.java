package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct3Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct3Dto.class.getName());

  private Integer recurring_id ;
  private java.math.BigDecimal price ;
  private String frequency ;
  private Integer duration ;
  private Integer cycle ;
  private Byte trial_status ;
  private java.math.BigDecimal trial_price ;
  private String trial_frequency ;
  private Integer trial_duration ;
  private Integer trial_cycle ;
  private Byte status ;
  private Integer sort_order ;
  private Integer product_id ;
  private Integer recurring_id0 ;
  private Integer customer_group_id ;

  public Integer getRecurring_id() {
    return this.recurring_id;
  }
  public void setRecurring_id( Integer value) {
    this.recurring_id = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public String getFrequency() {
    return this.frequency;
  }
  public void setFrequency( String value) {
    this.frequency = value;
  }
  public Integer getDuration() {
    return this.duration;
  }
  public void setDuration( Integer value) {
    this.duration = value;
  }
  public Integer getCycle() {
    return this.cycle;
  }
  public void setCycle( Integer value) {
    this.cycle = value;
  }
  public Byte getTrial_status() {
    return this.trial_status;
  }
  public void setTrial_status( Byte value) {
    this.trial_status = value;
  }
  public java.math.BigDecimal getTrial_price() {
    return this.trial_price;
  }
  public void setTrial_price( java.math.BigDecimal value) {
    this.trial_price = value;
  }
  public String getTrial_frequency() {
    return this.trial_frequency;
  }
  public void setTrial_frequency( String value) {
    this.trial_frequency = value;
  }
  public Integer getTrial_duration() {
    return this.trial_duration;
  }
  public void setTrial_duration( Integer value) {
    this.trial_duration = value;
  }
  public Integer getTrial_cycle() {
    return this.trial_cycle;
  }
  public void setTrial_cycle( Integer value) {
    this.trial_cycle = value;
  }
  public Byte getStatus() {
    return this.status;
  }
  public void setStatus( Byte value) {
    this.status = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Integer getProduct_id() {
    return this.product_id;
  }
  public void setProduct_id( Integer value) {
    this.product_id = value;
  }
  public Integer getRecurring_id0() {
    return this.recurring_id0;
  }
  public void setRecurring_id0( Integer value) {
    this.recurring_id0 = value;
  }
  public Integer getCustomer_group_id() {
    return this.customer_group_id;
  }
  public void setCustomer_group_id( Integer value) {
    this.customer_group_id = value;
  }

  public static ModelCatalogProduct3Dto fromArray(Object[] o) {
    ModelCatalogProduct3Dto result = new ModelCatalogProduct3Dto();
    int i = 0;
    result.setRecurring_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setPrice((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setFrequency((String)DaoUtils.getNullableValue(o[i++]));
    result.setDuration((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCycle((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_status((Byte)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_price((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_frequency((String)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_duration((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTrial_cycle((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Byte)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setRecurring_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustomer_group_id((Integer)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.recurring_id)); 
    builder.append(String.valueOf(this.price)); 
    builder.append(String.valueOf(this.frequency)); 
    builder.append(String.valueOf(this.duration)); 
    builder.append(String.valueOf(this.cycle)); 
    builder.append(String.valueOf(this.trial_status)); 
    builder.append(String.valueOf(this.trial_price)); 
    builder.append(String.valueOf(this.trial_frequency)); 
    builder.append(String.valueOf(this.trial_duration)); 
    builder.append(String.valueOf(this.trial_cycle)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.product_id)); 
    builder.append(String.valueOf(this.recurring_id0)); 
    builder.append(String.valueOf(this.customer_group_id)); ;
    return builder.toString();
  }
}