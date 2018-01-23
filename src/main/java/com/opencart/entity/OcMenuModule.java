
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
@Table(name="oc_menu_module")
public class OcMenuModule  {
  @Id
  @Column(name="\"menu_module_id\"" , length=10)
  @NotNull
  private Integer menu_module_id;

  @Basic
  @Column(name="\"menu_id\"" , length=10)
  @NotNull
  private Integer menu_id;

  @Basic
  @Column(name="\"code\"" , length=64)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcMenuModule() {
  }

  public void setMenuModuleId( Integer value) {
    this.menu_module_id = value;
  }
  public Integer getMenuModuleId() {
    return this.menu_module_id;
  }
  public void setMenuId( Integer value) {
    this.menu_id = value;
  }
  public Integer getMenuId() {
    return this.menu_id;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.menu_module_id)); 
     builder.append(String.valueOf(this.menu_id)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}