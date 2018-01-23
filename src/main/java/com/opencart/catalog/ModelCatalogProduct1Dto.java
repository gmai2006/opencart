package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct1Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct1Dto.class.getName());

  private Integer product_option_value_id ;
  private Integer product_option_id ;
  private Integer product_id ;
  private Integer option_id ;
  private Integer option_value_id ;
  private Integer quantity ;
  private Boolean subtract ;
  private java.math.BigDecimal price ;
  private String price_prefix ;
  private Integer points ;
  private String points_prefix ;
  private java.math.BigDecimal weight ;
  private String weight_prefix ;
  private Integer option_value_id0 ;
  private Integer option_id0 ;
  private String image ;
  private Integer sort_order ;
  private Integer option_value_id01 ;
  private Integer language_id ;
  private Integer option_id01 ;
  private String name ;

  public Integer getProduct_option_value_id() {
    return this.product_option_value_id;
  }
  public void setProduct_option_value_id( Integer value) {
    this.product_option_value_id = value;
  }
  public Integer getProduct_option_id() {
    return this.product_option_id;
  }
  public void setProduct_option_id( Integer value) {
    this.product_option_id = value;
  }
  public Integer getProduct_id() {
    return this.product_id;
  }
  public void setProduct_id( Integer value) {
    this.product_id = value;
  }
  public Integer getOption_id() {
    return this.option_id;
  }
  public void setOption_id( Integer value) {
    this.option_id = value;
  }
  public Integer getOption_value_id() {
    return this.option_value_id;
  }
  public void setOption_value_id( Integer value) {
    this.option_value_id = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Boolean getSubtract() {
    return this.subtract;
  }
  public void setSubtract( Boolean value) {
    this.subtract = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public String getPrice_prefix() {
    return this.price_prefix;
  }
  public void setPrice_prefix( String value) {
    this.price_prefix = value;
  }
  public Integer getPoints() {
    return this.points;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public String getPoints_prefix() {
    return this.points_prefix;
  }
  public void setPoints_prefix( String value) {
    this.points_prefix = value;
  }
  public java.math.BigDecimal getWeight() {
    return this.weight;
  }
  public void setWeight( java.math.BigDecimal value) {
    this.weight = value;
  }
  public String getWeight_prefix() {
    return this.weight_prefix;
  }
  public void setWeight_prefix( String value) {
    this.weight_prefix = value;
  }
  public Integer getOption_value_id0() {
    return this.option_value_id0;
  }
  public void setOption_value_id0( Integer value) {
    this.option_value_id0 = value;
  }
  public Integer getOption_id0() {
    return this.option_id0;
  }
  public void setOption_id0( Integer value) {
    this.option_id0 = value;
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
  public Integer getOption_value_id01() {
    return this.option_value_id01;
  }
  public void setOption_value_id01( Integer value) {
    this.option_value_id01 = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public Integer getOption_id01() {
    return this.option_id01;
  }
  public void setOption_id01( Integer value) {
    this.option_id01 = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }

  public static ModelCatalogProduct1Dto fromArray(Object[] o) {
    ModelCatalogProduct1Dto result = new ModelCatalogProduct1Dto();
    int i = 0;
    result.setProduct_option_value_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_option_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_value_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setQuantity((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setSubtract((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setPrice((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setPrice_prefix((String)DaoUtils.getNullableValue(o[i++]));
    result.setPoints((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setPoints_prefix((String)DaoUtils.getNullableValue(o[i++]));
    result.setWeight((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setWeight_prefix((String)DaoUtils.getNullableValue(o[i++]));
    result.setOption_value_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_value_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOption_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.product_option_value_id)); 
    builder.append(String.valueOf(this.product_option_id)); 
    builder.append(String.valueOf(this.product_id)); 
    builder.append(String.valueOf(this.option_id)); 
    builder.append(String.valueOf(this.option_value_id)); 
    builder.append(String.valueOf(this.quantity)); 
    builder.append(String.valueOf(this.subtract)); 
    builder.append(String.valueOf(this.price)); 
    builder.append(String.valueOf(this.price_prefix)); 
    builder.append(String.valueOf(this.points)); 
    builder.append(String.valueOf(this.points_prefix)); 
    builder.append(String.valueOf(this.weight)); 
    builder.append(String.valueOf(this.weight_prefix)); 
    builder.append(String.valueOf(this.option_value_id0)); 
    builder.append(String.valueOf(this.option_id0)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.option_value_id01)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.option_id01)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}