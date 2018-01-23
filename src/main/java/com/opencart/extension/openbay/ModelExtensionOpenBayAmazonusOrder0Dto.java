package com.opencart.extension.openbay;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelExtensionOpenBayAmazonusOrder0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayAmazonusOrder0Dto.class.getName());

  private Integer product_option_id ;
  private Integer product_option_value_id ;
  private String name ;
  private String value ;
  private String type ;

  public Integer getProduct_option_id() {
    return this.product_option_id;
  }
  public void setProduct_option_id( Integer value) {
    this.product_option_id = value;
  }
  public Integer getProduct_option_value_id() {
    return this.product_option_value_id;
  }
  public void setProduct_option_value_id( Integer value) {
    this.product_option_value_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }

  public static ModelExtensionOpenBayAmazonusOrder0Dto fromArray(Object[] o) {
    ModelExtensionOpenBayAmazonusOrder0Dto result = new ModelExtensionOpenBayAmazonusOrder0Dto();
    int i = 0;
    result.setProduct_option_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_option_value_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setValue((String)DaoUtils.getNullableValue(o[i++]));
    result.setType((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.product_option_id)); 
    builder.append(String.valueOf(this.product_option_value_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.value)); 
    builder.append(String.valueOf(this.type)); ;
    return builder.toString();
  }
}