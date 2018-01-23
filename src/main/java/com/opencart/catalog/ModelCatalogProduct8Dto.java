package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct8Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct8Dto.class.getName());

  private Integer product_id ;
  private java.math.BigDecimal total ;

  public Integer getProduct_id() {
    return this.product_id;
  }
  public void setProduct_id( Integer value) {
    this.product_id = value;
  }
  public java.math.BigDecimal getTotal() {
    return this.total;
  }
  public void setTotal( java.math.BigDecimal value) {
    this.total = value;
  }

  public static ModelCatalogProduct8Dto fromArray(Object[] o) {
    ModelCatalogProduct8Dto result = new ModelCatalogProduct8Dto();
    int i = 0;
    result.setProduct_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTotal((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.product_id)); 
    builder.append(String.valueOf(this.total)); ;
    return builder.toString();
  }
}