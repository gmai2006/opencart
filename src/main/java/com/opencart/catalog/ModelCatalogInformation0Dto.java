package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogInformation0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogInformation0Dto.class.getName());

  private Integer information_id ;
  private Integer bottom ;
  private Integer sort_order ;
  private Boolean status ;
  private Integer information_id0 ;
  private Integer language_id ;
  private String title ;
  private String description ;
  private String meta_title ;
  private String meta_description ;
  private String meta_keyword ;
  private Integer information_id01 ;
  private Integer store_id ;

  public Integer getInformation_id() {
    return this.information_id;
  }
  public void setInformation_id( Integer value) {
    this.information_id = value;
  }
  public Integer getBottom() {
    return this.bottom;
  }
  public void setBottom( Integer value) {
    this.bottom = value;
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
  public Integer getInformation_id0() {
    return this.information_id0;
  }
  public void setInformation_id0( Integer value) {
    this.information_id0 = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
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
  public Integer getInformation_id01() {
    return this.information_id01;
  }
  public void setInformation_id01( Integer value) {
    this.information_id01 = value;
  }
  public Integer getStore_id() {
    return this.store_id;
  }
  public void setStore_id( Integer value) {
    this.store_id = value;
  }

  public static ModelCatalogInformation0Dto fromArray(Object[] o) {
    ModelCatalogInformation0Dto result = new ModelCatalogInformation0Dto();
    int i = 0;
    result.setInformation_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setBottom((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setInformation_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTitle((String)DaoUtils.getNullableValue(o[i++]));
    result.setDescription((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_title((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_description((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_keyword((String)DaoUtils.getNullableValue(o[i++]));
    result.setInformation_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStore_id((Integer)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.information_id)); 
    builder.append(String.valueOf(this.bottom)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.information_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.title)); 
    builder.append(String.valueOf(this.description)); 
    builder.append(String.valueOf(this.meta_title)); 
    builder.append(String.valueOf(this.meta_description)); 
    builder.append(String.valueOf(this.meta_keyword)); 
    builder.append(String.valueOf(this.information_id01)); 
    builder.append(String.valueOf(this.store_id)); ;
    return builder.toString();
  }
}