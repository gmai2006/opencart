package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogCategory0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogCategory0Dto.class.getName());

  private Integer filter_id ;
  private String name ;

  public Integer getFilter_id() {
    return this.filter_id;
  }
  public void setFilter_id( Integer value) {
    this.filter_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }

  public static ModelCatalogCategory0Dto fromArray(Object[] o) {
    ModelCatalogCategory0Dto result = new ModelCatalogCategory0Dto();
    int i = 0;
    result.setFilter_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.filter_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}