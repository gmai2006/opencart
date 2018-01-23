
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
@Table(name="oc_layout_module")
public class OcLayoutModule  {
  @Id
  @Column(name="\"layout_module_id\"" , length=10)
  @NotNull
  private Integer layout_module_id;

  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layout_id;

  @Basic
  @Column(name="\"code\"" , length=64)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"position\"" , length=14)
  @NotNull
  private String position;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcLayoutModule() {
  }

  public void setLayoutModuleId( Integer value) {
    this.layout_module_id = value;
  }
  public Integer getLayoutModuleId() {
    return this.layout_module_id;
  }
  public void setLayoutId( Integer value) {
    this.layout_id = value;
  }
  public Integer getLayoutId() {
    return this.layout_id;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setPosition( String value) {
    this.position = value;
  }
  public String getPosition() {
    return this.position;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.layout_module_id)); 
     builder.append(String.valueOf(this.layout_id)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.position)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}