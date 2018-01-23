package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogManufacturer0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogManufacturer0Dto.class.getName());

  private Integer manufacturer_id ;
  private String name ;
  private String image ;
  private Integer sort_order ;
  private Integer manufacturer_id0 ;
  private Integer store_id ;

  public Integer getManufacturer_id() {
    return this.manufacturer_id;
  }
  public void setManufacturer_id( Integer value) {
    this.manufacturer_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Integer getManufacturer_id0() {
    return this.manufacturer_id0;
  }
  public void setManufacturer_id0( Integer value) {
    this.manufacturer_id0 = value;
  }
  public Integer getStore_id() {
    return this.store_id;
  }
  public void setStore_id( Integer value) {
    this.store_id = value;
  }

  public static ModelCatalogManufacturer0Dto fromArray(Object[] o) {
    ModelCatalogManufacturer0Dto result = new ModelCatalogManufacturer0Dto();
    int i = 0;
    result.setManufacturer_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setManufacturer_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStore_id((Integer)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.manufacturer_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.manufacturer_id0)); 
    builder.append(String.valueOf(this.store_id)); ;
    return builder.toString();
  }
}