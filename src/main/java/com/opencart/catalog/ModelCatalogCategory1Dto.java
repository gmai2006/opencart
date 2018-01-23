package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogCategory1Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogCategory1Dto.class.getName());

  private Integer filter_group_id ;
  private String name ;
  private Integer sort_order ;

  public Integer getFilter_group_id() {
    return this.filter_group_id;
  }
  public void setFilter_group_id( Integer value) {
    this.filter_group_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }

  public static ModelCatalogCategory1Dto fromArray(Object[] o) {
    ModelCatalogCategory1Dto result = new ModelCatalogCategory1Dto();
    int i = 0;
    result.setFilter_group_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.filter_group_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}