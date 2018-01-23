
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
@Table(name="oc_coupon")
public class OcCoupon  {
  @Id
  @Column(name="\"coupon_id\"" , length=10)
  @NotNull
  private Integer coupon_id;

  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"code\"" , length=20)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"type\"" , length=1)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"discount\"" , length=15)
  @NotNull
  private java.math.BigDecimal discount;

  @Basic
  @Column(name="\"logged\"" )
  @NotNull
  private Boolean logged;

  @Basic
  @Column(name="\"shipping\"" )
  @NotNull
  private Boolean shipping;

  @Basic
  @Column(name="\"total\"" , length=15)
  @NotNull
  private java.math.BigDecimal total;

  @Basic
  @Column(name="\"date_start\"" , length=10)
  @NotNull
  private java.util.Date date_start = new java.util.Date();

  @Basic
  @Column(name="\"date_end\"" , length=10)
  @NotNull
  private java.util.Date date_end = new java.util.Date();

  @Basic
  @Column(name="\"uses_total\"" , length=10)
  @NotNull
  private Integer uses_total;

  @Basic
  @Column(name="\"uses_customer\"" , length=11)
  @NotNull
  private String uses_customer;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcCoupon() {
  }

  public void setCouponId( Integer value) {
    this.coupon_id = value;
  }
  public Integer getCouponId() {
    return this.coupon_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setDiscount( java.math.BigDecimal value) {
    this.discount = value;
  }
  public java.math.BigDecimal getDiscount() {
    return this.discount;
  }
  public void setLogged( Boolean value) {
    this.logged = value;
  }
  public Boolean getLogged() {
    return this.logged;
  }
  public void setShipping( Boolean value) {
    this.shipping = value;
  }
  public Boolean getShipping() {
    return this.shipping;
  }
  public void setTotal( java.math.BigDecimal value) {
    this.total = value;
  }
  public java.math.BigDecimal getTotal() {
    return this.total;
  }
  public void setDateStart( java.util.Date value) {
    this.date_start = value;
  }
  public java.util.Date getDateStart() {
    return this.date_start;
  }
  public void setDateEnd( java.util.Date value) {
    this.date_end = value;
  }
  public java.util.Date getDateEnd() {
    return this.date_end;
  }
  public void setUsesTotal( Integer value) {
    this.uses_total = value;
  }
  public Integer getUsesTotal() {
    return this.uses_total;
  }
  public void setUsesCustomer( String value) {
    this.uses_customer = value;
  }
  public String getUsesCustomer() {
    return this.uses_customer;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.coupon_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.discount)); 
     builder.append(String.valueOf(this.logged)); 
     builder.append(String.valueOf(this.shipping)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.date_start)); 
     builder.append(String.valueOf(this.date_end)); 
     builder.append(String.valueOf(this.uses_total)); 
     builder.append(String.valueOf(this.uses_customer)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}