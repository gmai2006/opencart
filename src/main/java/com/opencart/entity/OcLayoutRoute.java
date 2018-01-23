
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
@Table(name="oc_layout_route")
public class OcLayoutRoute  {
  @Id
  @Column(name="\"layout_route_id\"" , length=10)
  @NotNull
  private Integer layout_route_id;

  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layout_id;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"route\"" , length=64)
  @NotNull
  private String route;

  public OcLayoutRoute() {
  }

  public void setLayoutRouteId( Integer value) {
    this.layout_route_id = value;
  }
  public Integer getLayoutRouteId() {
    return this.layout_route_id;
  }
  public void setLayoutId( Integer value) {
    this.layout_id = value;
  }
  public Integer getLayoutId() {
    return this.layout_id;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.layout_route_id)); 
     builder.append(String.valueOf(this.layout_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.route)); ;
    return builder.toString();
  }
}