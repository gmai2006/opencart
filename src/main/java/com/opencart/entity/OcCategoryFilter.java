
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
@Table(name="oc_category_filter")
@IdClass(value=OcCategoryFilterId.class)
public class OcCategoryFilter  {
  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer category_id;

  @Id
  @Column(name="\"filter_id\"" , length=10)
  @NotNull
  private Integer filter_id;

  public OcCategoryFilter() {
  }

  public void setCategoryId( Integer value) {
    this.category_id = value;
  }
  public Integer getCategoryId() {
    return this.category_id;
  }
  public void setFilterId( Integer value) {
    this.filter_id = value;
  }
  public Integer getFilterId() {
    return this.filter_id;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.category_id)); 
     builder.append(String.valueOf(this.filter_id)); ;
    return builder.toString();
  }
}