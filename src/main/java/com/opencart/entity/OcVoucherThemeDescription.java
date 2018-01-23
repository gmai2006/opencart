
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
@Table(name="oc_voucher_theme_description")
@IdClass(value=OcVoucherThemeDescriptionId.class)
public class OcVoucherThemeDescription  {
  @Id
  @Column(name="\"voucher_theme_id\"" , length=10)
  @NotNull
  private Integer voucher_theme_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  public OcVoucherThemeDescription() {
  }

  public void setVoucherThemeId( Integer value) {
    this.voucher_theme_id = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucher_theme_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.voucher_theme_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}