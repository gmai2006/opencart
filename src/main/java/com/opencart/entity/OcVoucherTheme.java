
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
@Table(name="oc_voucher_theme")
public class OcVoucherTheme  {
  @Id
  @Column(name="\"voucher_theme_id\"" , length=10)
  @NotNull
  private Integer voucher_theme_id;

  @Basic
  @Column(name="\"image\"" , length=255)
  @NotNull
  private String image;

  public OcVoucherTheme() {
  }

  public void setVoucherThemeId( Integer value) {
    this.voucher_theme_id = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucher_theme_id;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.voucher_theme_id)); 
     builder.append(String.valueOf(this.image)); ;
    return builder.toString();
  }
}