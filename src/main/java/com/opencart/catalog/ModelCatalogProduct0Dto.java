package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct0Dto.class.getName());

  private Integer attribute_id ;
  private String name ;
  private String text ;

  public Integer getAttribute_id() {
    return this.attribute_id;
  }
  public void setAttribute_id( Integer value) {
    this.attribute_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }

  public static ModelCatalogProduct0Dto fromArray(Object[] o) {
    ModelCatalogProduct0Dto result = new ModelCatalogProduct0Dto();
    int i = 0;
    result.setAttribute_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setText((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.attribute_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.text)); ;
    return builder.toString();
  }
}