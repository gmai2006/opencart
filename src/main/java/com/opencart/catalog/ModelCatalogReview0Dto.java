package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogReview0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogReview0Dto.class.getName());

  private Integer review_id ;
  private String author ;
  private Integer rating ;
  private String text ;
  private Integer product_id ;
  private String name ;
  private java.math.BigDecimal price ;
  private String image ;
  private java.sql.Timestamp date_added ;

  public Integer getReview_id() {
    return this.review_id;
  }
  public void setReview_id( Integer value) {
    this.review_id = value;
  }
  public String getAuthor() {
    return this.author;
  }
  public void setAuthor( String value) {
    this.author = value;
  }
  public Integer getRating() {
    return this.rating;
  }
  public void setRating( Integer value) {
    this.rating = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }
  public Integer getProduct_id() {
    return this.product_id;
  }
  public void setProduct_id( Integer value) {
    this.product_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }

  public static ModelCatalogReview0Dto fromArray(Object[] o) {
    ModelCatalogReview0Dto result = new ModelCatalogReview0Dto();
    int i = 0;
    result.setReview_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setAuthor((String)DaoUtils.getNullableValue(o[i++]));
    result.setRating((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setText((String)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setPrice((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.review_id)); 
    builder.append(String.valueOf(this.author)); 
    builder.append(String.valueOf(this.rating)); 
    builder.append(String.valueOf(this.text)); 
    builder.append(String.valueOf(this.product_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.price)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}