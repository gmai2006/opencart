
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
@Table(name="oc_product_related")
@IdClass(value=OcProductRelatedId.class)
public class OcProductRelated  {
  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Id
  @Column(name="\"related_id\"" , length=10)
  @NotNull
  private Integer related_id;

  public OcProductRelated() {
  }

  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setRelatedId( Integer value) {
    this.related_id = value;
  }
  public Integer getRelatedId() {
    return this.related_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.related_id)); ;
    return builder.toString();
  }
}