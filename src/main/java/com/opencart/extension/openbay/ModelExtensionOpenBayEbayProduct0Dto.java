package com.opencart.extension.openbay;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelExtensionOpenBayEbayProduct0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayEbayProduct0Dto.class.getName());

  private Integer option_id ;
  private String type ;
  private Integer sort_order ;
  private Integer option_id0 ;
  private Integer language_id ;
  private String name ;

  public Integer getOption_id() {
    return this.option_id;
  }
  public void setOption_id( Integer value) {
    this.option_id = value;
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
  public Integer getOption_id0() {
    return this.option_id0;
  }
  public void setOption_id0( Integer value) {
    this.option_id0 = value;
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

  public static ModelExtensionOpenBayEbayProduct0Dto fromArray(Object[] o) {
    ModelExtensionOpenBayEbayProduct0Dto result = new ModelExtensionOpenBayEbayProduct0Dto();
    int i = 0;
    result.setOption_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setType((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.option_id)); 
    builder.append(String.valueOf(this.type)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.option_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}