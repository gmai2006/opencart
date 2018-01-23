package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct5Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct5Dto.class.getName());

  private Integer attribute_group_id ;
  private String name ;

  public Integer getAttribute_group_id() {
    return this.attribute_group_id;
  }
  public void setAttribute_group_id( Integer value) {
    this.attribute_group_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }

  public static ModelCatalogProduct5Dto fromArray(Object[] o) {
    ModelCatalogProduct5Dto result = new ModelCatalogProduct5Dto();
    int i = 0;
    result.setAttribute_group_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.attribute_group_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}