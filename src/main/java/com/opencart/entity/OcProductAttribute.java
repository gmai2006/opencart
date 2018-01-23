
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
@Table(name="oc_product_attribute")
@IdClass(value=OcProductAttributeId.class)
public class OcProductAttribute  {
  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Id
  @Column(name="\"attribute_id\"" , length=10)
  @NotNull
  private Integer attribute_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"text\"" , length=65535)
  @NotNull
  private String text;

  public OcProductAttribute() {
  }

  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setAttributeId( Integer value) {
    this.attribute_id = value;
  }
  public Integer getAttributeId() {
    return this.attribute_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.attribute_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.text)); ;
    return builder.toString();
  }
}