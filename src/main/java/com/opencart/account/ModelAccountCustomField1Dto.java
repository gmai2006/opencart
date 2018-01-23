package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountCustomField1Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountCustomField1Dto.class.getName());

  private Integer custom_field_id ;
  private Integer customer_group_id ;
  private Boolean required ;
  private Integer custom_field_id0 ;
  private String type ;
  private String value ;
  private String validation ;
  private String location ;
  private Boolean status ;
  private Integer sort_order ;
  private Integer custom_field_id01 ;
  private Integer language_id ;
  private String name ;

  public Integer getCustom_field_id() {
    return this.custom_field_id;
  }
  public void setCustom_field_id( Integer value) {
    this.custom_field_id = value;
  }
  public Integer getCustomer_group_id() {
    return this.customer_group_id;
  }
  public void setCustomer_group_id( Integer value) {
    this.customer_group_id = value;
  }
  public Boolean getRequired() {
    return this.required;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Integer getCustom_field_id0() {
    return this.custom_field_id0;
  }
  public void setCustom_field_id0( Integer value) {
    this.custom_field_id0 = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValidation() {
    return this.validation;
  }
  public void setValidation( String value) {
    this.validation = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Integer getCustom_field_id01() {
    return this.custom_field_id01;
  }
  public void setCustom_field_id01( Integer value) {
    this.custom_field_id01 = value;
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

  public static ModelAccountCustomField1Dto fromArray(Object[] o) {
    ModelAccountCustomField1Dto result = new ModelAccountCustomField1Dto();
    int i = 0;
    result.setCustom_field_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustomer_group_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setRequired((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setCustom_field_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setType((String)DaoUtils.getNullableValue(o[i++]));
    result.setValue((String)DaoUtils.getNullableValue(o[i++]));
    result.setValidation((String)DaoUtils.getNullableValue(o[i++]));
    result.setLocation((String)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustom_field_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.custom_field_id)); 
    builder.append(String.valueOf(this.customer_group_id)); 
    builder.append(String.valueOf(this.required)); 
    builder.append(String.valueOf(this.custom_field_id0)); 
    builder.append(String.valueOf(this.type)); 
    builder.append(String.valueOf(this.value)); 
    builder.append(String.valueOf(this.validation)); 
    builder.append(String.valueOf(this.location)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.custom_field_id01)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}