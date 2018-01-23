package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogCategory2Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogCategory2Dto.class.getName());

  private Integer category_id ;
  private String image ;
  private Integer parent_id ;
  private Boolean top ;
  private Integer column ;
  private Integer sort_order ;
  private Boolean status ;
  private java.sql.Timestamp date_added ;
  private java.sql.Timestamp date_modified ;
  private Integer category_id0 ;
  private Integer language_id ;
  private String name ;
  private String description ;
  private String meta_title ;
  private String meta_description ;
  private String meta_keyword ;
  private Integer category_id01 ;
  private Integer store_id ;

  public Integer getCategory_id() {
    return this.category_id;
  }
  public void setCategory_id( Integer value) {
    this.category_id = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public Integer getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( Integer value) {
    this.parent_id = value;
  }
  public Boolean getTop() {
    return this.top;
  }
  public void setTop( Boolean value) {
    this.top = value;
  }
  public Integer getColumn() {
    return this.column;
  }
  public void setColumn( Integer value) {
    this.column = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDate_modified() {
    return this.date_modified;
  }
  public void setDate_modified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public Integer getCategory_id0() {
    return this.category_id0;
  }
  public void setCategory_id0( Integer value) {
    this.category_id0 = value;
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
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getMeta_title() {
    return this.meta_title;
  }
  public void setMeta_title( String value) {
    this.meta_title = value;
  }
  public String getMeta_description() {
    return this.meta_description;
  }
  public void setMeta_description( String value) {
    this.meta_description = value;
  }
  public String getMeta_keyword() {
    return this.meta_keyword;
  }
  public void setMeta_keyword( String value) {
    this.meta_keyword = value;
  }
  public Integer getCategory_id01() {
    return this.category_id01;
  }
  public void setCategory_id01( Integer value) {
    this.category_id01 = value;
  }
  public Integer getStore_id() {
    return this.store_id;
  }
  public void setStore_id( Integer value) {
    this.store_id = value;
  }

  public static ModelCatalogCategory2Dto fromArray(Object[] o) {
    ModelCatalogCategory2Dto result = new ModelCatalogCategory2Dto();
    int i = 0;
    result.setCategory_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setParent_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTop((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setColumn((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setDate_modified((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setCategory_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setDescription((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_title((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_description((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_keyword((String)DaoUtils.getNullableValue(o[i++]));
    result.setCategory_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStore_id((Integer)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.category_id)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.parent_id)); 
    builder.append(String.valueOf(this.top)); 
    builder.append(String.valueOf(this.column)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.date_added)); 
    builder.append(String.valueOf(this.date_modified)); 
    builder.append(String.valueOf(this.category_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.description)); 
    builder.append(String.valueOf(this.meta_title)); 
    builder.append(String.valueOf(this.meta_description)); 
    builder.append(String.valueOf(this.meta_keyword)); 
    builder.append(String.valueOf(this.category_id01)); 
    builder.append(String.valueOf(this.store_id)); ;
    return builder.toString();
  }
}