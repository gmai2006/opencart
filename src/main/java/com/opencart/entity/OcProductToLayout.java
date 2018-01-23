
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
@Table(name="oc_product_to_layout")
@IdClass(value=OcProductToLayoutId.class)
public class OcProductToLayout  {
  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layout_id;

  public OcProductToLayout() {
  }

  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setLayoutId( Integer value) {
    this.layout_id = value;
  }
  public Integer getLayoutId() {
    return this.layout_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.layout_id)); ;
    return builder.toString();
  }
}