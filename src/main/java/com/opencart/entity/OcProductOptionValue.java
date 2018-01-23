
package com.opencart.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_product_option_value")
public class OcProductOptionValue  {
  @Id
  @Column(name="\"product_option_value_id\"" , length=10)
  @NotNull
  private Integer product_option_value_id;

  @Basic
  @Column(name="\"product_option_id\"" , length=10)
  @NotNull
  private Integer product_option_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer option_id;

  @Basic
  @Column(name="\"option_value_id\"" , length=10)
  @NotNull
  private Integer option_value_id;

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"subtract\"" )
  @NotNull
  private Boolean subtract;

  @Basic
  @Column(name="\"price\"" , length=15)
  @NotNull
  private java.math.BigDecimal price;

  @Basic
  @Column(name="\"price_prefix\"" , length=1)
  @NotNull
  private String price_prefix;

  @Basic
  @Column(name="\"points\"" , length=10)
  @NotNull
  private Integer points;

  @Basic
  @Column(name="\"points_prefix\"" , length=1)
  @NotNull
  private String points_prefix;

  @Basic
  @Column(name="\"weight\"" , length=15)
  @NotNull
  private java.math.BigDecimal weight;

  @Basic
  @Column(name="\"weight_prefix\"" , length=1)
  @NotNull
  private String weight_prefix;

  public OcProductOptionValue() {
  }

  public void setProductOptionValueId( Integer value) {
    this.product_option_value_id = value;
  }
  public Integer getProductOptionValueId() {
    return this.product_option_value_id;
  }
  public void setProductOptionId( Integer value) {
    this.product_option_id = value;
  }
  public Integer getProductOptionId() {
    return this.product_option_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setOptionId( Integer value) {
    this.option_id = value;
  }
  public Integer getOptionId() {
    return this.option_id;
  }
  public void setOptionValueId( Integer value) {
    this.option_value_id = value;
  }
  public Integer getOptionValueId() {
    return this.option_value_id;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setSubtract( Boolean value) {
    this.subtract = value;
  }
  public Boolean getSubtract() {
    return this.subtract;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setPricePrefix( String value) {
    this.price_prefix = value;
  }
  public String getPricePrefix() {
    return this.price_prefix;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }
  public void setPointsPrefix( String value) {
    this.points_prefix = value;
  }
  public String getPointsPrefix() {
    return this.points_prefix;
  }
  public void setWeight( java.math.BigDecimal value) {
    this.weight = value;
  }
  public java.math.BigDecimal getWeight() {
    return this.weight;
  }
  public void setWeightPrefix( String value) {
    this.weight_prefix = value;
  }
  public String getWeightPrefix() {
    return this.weight_prefix;
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
     builder.append(String.valueOf(this.weight_prefix)); ;
    return builder.toString();
  }
}