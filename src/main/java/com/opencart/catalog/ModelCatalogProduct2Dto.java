package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct2Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct2Dto.class.getName());

  private Integer recurring_id ;
  private Integer language_id ;
  private String name ;

  public Integer getRecurring_id() {
    return this.recurring_id;
  }
  public void setRecurring_id( Integer value) {
    this.recurring_id = value;
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

  public static ModelCatalogProduct2Dto fromArray(Object[] o) {
    ModelCatalogProduct2Dto result = new ModelCatalogProduct2Dto();
    int i = 0;
    result.setRecurring_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.recurring_id)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}