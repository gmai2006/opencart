package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountCustomField0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountCustomField0Dto.class.getName());

  private Integer custom_field_value_id ;
  private Integer custom_field_id ;
  private Integer sort_order ;
  private Integer custom_field_value_id0 ;
  private Integer language_id ;
  private Integer custom_field_id0 ;
  private String name ;

  public Integer getCustom_field_value_id() {
    return this.custom_field_value_id;
  }
  public void setCustom_field_value_id( Integer value) {
    this.custom_field_value_id = value;
  }
  public Integer getCustom_field_id() {
    return this.custom_field_id;
  }
  public void setCustom_field_id( Integer value) {
    this.custom_field_id = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Integer getCustom_field_value_id0() {
    return this.custom_field_value_id0;
  }
  public void setCustom_field_value_id0( Integer value) {
    this.custom_field_value_id0 = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public Integer getCustom_field_id0() {
    return this.custom_field_id0;
  }
  public void setCustom_field_id0( Integer value) {
    this.custom_field_id0 = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }

  public static ModelAccountCustomField0Dto fromArray(Object[] o) {
    ModelAccountCustomField0Dto result = new ModelAccountCustomField0Dto();
    int i = 0;
    result.setCustom_field_value_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustom_field_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustom_field_value_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustom_field_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.custom_field_value_id)); 
    builder.append(String.valueOf(this.custom_field_id)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.custom_field_value_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.custom_field_id0)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}