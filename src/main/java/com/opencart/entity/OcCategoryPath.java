
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
@Table(name="oc_category_path")
@IdClass(value=OcCategoryPathId.class)
public class OcCategoryPath  {
  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer category_id;

  @Id
  @Column(name="\"path_id\"" , length=10)
  @NotNull
  private Integer path_id;

  @Basic
  @Column(name="\"level\"" , length=10)
  @NotNull
  private Integer level;

  public OcCategoryPath() {
  }

  public void setCategoryId( Integer value) {
    this.category_id = value;
  }
  public Integer getCategoryId() {
    return this.category_id;
  }
  public void setPathId( Integer value) {
    this.path_id = value;
  }
  public Integer getPathId() {
    return this.path_id;
  }
  public void setLevel( Integer value) {
    this.level = value;
  }
  public Integer getLevel() {
    return this.level;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.category_id)); 
     builder.append(String.valueOf(this.path_id)); 
     builder.append(String.valueOf(this.level)); ;
    return builder.toString();
  }
}