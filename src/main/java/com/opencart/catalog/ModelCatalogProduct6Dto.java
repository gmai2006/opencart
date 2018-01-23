package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct6Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct6Dto.class.getName());

  private Integer product_option_id ;
  private Integer product_id ;
  private Integer option_id ;
  private String value ;
  private Boolean required ;
  private Integer option_id0 ;
  private String type ;
  private Integer sort_order ;
  private Integer option_id01 ;
  private Integer language_id ;
  private String name ;

  public Integer getProduct_option_id() {
    return this.product_option_id;
  }
  public void setProduct_option_id( Integer value) {
    this.product_option_id = value;
  }
  public Integer getProduct_id() {
    return this.product_id;
  }
  public void setProduct_id( Integer value) {
    this.product_id = value;
  }
  public Integer getOption_id() {
    return this.option_id;
  }
  public void setOption_id( Integer value) {
    this.option_id = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public Boolean getRequired() {
    return this.required;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Integer getOption_id0() {
    return this.option_id0;
  }
  public void setOption_id0( Integer value) {
    this.option_id0 = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Integer getOption_id01() {
    return this.option_id01;
  }
  public void setOption_id01( Integer value) {
    this.option_id01 = value;
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

  public static ModelCatalogProduct6Dto fromArray(Object[] o) {
    ModelCatalogProduct6Dto result = new ModelCatalogProduct6Dto();
    int i = 0;
    result.setProduct_option_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setValue((String)DaoUtils.getNullableValue(o[i++]));
    result.setRequired((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setOption_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setType((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.product_option_id)); 
    builder.append(String.valueOf(this.product_id)); 
    builder.append(String.valueOf(this.option_id)); 
    builder.append(String.valueOf(this.value)); 
    builder.append(String.valueOf(this.required)); 
    builder.append(String.valueOf(this.option_id0)); 
    builder.append(String.valueOf(this.type)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.option_id01)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}