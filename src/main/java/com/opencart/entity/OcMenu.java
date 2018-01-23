
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
@Table(name="oc_menu")
public class OcMenu  {
  @Id
  @Column(name="\"menu_id\"" , length=10)
  @NotNull
  private Integer menu_id;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"type\"" , length=6)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"link\"" , length=255)
  @NotNull
  private String link;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcMenu() {
  }

  public void setMenuId( Integer value) {
    this.menu_id = value;
  }
  public Integer getMenuId() {
    return this.menu_id;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.menu_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.link)); 
     builder.append(String.valueOf(this.sort_order)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}