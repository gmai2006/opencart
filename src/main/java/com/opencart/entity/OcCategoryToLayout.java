
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
@Table(name="oc_category_to_layout")
@IdClass(value=OcCategoryToLayoutId.class)
public class OcCategoryToLayout  {
  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer category_id;

  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layout_id;

  public OcCategoryToLayout() {
  }

  public void setCategoryId( Integer value) {
    this.category_id = value;
  }
  public Integer getCategoryId() {
    return this.category_id;
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
     builder.append(String.valueOf(this.category_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.layout_id)); ;
    return builder.toString();
  }
}