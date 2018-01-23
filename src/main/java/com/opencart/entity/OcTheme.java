
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
@Table(name="oc_theme")
public class OcTheme  {
  @Id
  @Column(name="\"theme_id\"" , length=10)
  @NotNull
  private Integer theme_id;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"theme\"" , length=64)
  @NotNull
  private String theme;

  @Basic
  @Column(name="\"route\"" , length=64)
  @NotNull
  private String route;

  @Basic
  @Column(name="\"code\"" , length=65535)
  @NotNull
  private String code;

  public OcTheme() {
  }

  public void setThemeId( Integer value) {
    this.theme_id = value;
  }
  public Integer getThemeId() {
    return this.theme_id;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setTheme( String value) {
    this.theme = value;
  }
  public String getTheme() {
    return this.theme;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.theme_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.theme)); 
     builder.append(String.valueOf(this.route)); 
     builder.append(String.valueOf(this.code)); ;
    return builder.toString();
  }
}