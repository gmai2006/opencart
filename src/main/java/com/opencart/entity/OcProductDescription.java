
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
@Table(name="oc_product_description")
@IdClass(value=OcProductDescriptionId.class)
public class OcProductDescription  {
  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="\"tag\"" , length=65535)
  @NotNull
  private String tag;

  @Basic
  @Column(name="\"meta_title\"" , length=255)
  @NotNull
  private String meta_title;

  @Basic
  @Column(name="\"meta_description\"" , length=255)
  @NotNull
  private String meta_description;

  @Basic
  @Column(name="\"meta_keyword\"" , length=255)
  @NotNull
  private String meta_keyword;

  public OcProductDescription() {
  }

  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
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
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setTag( String value) {
    this.tag = value;
  }
  public String getTag() {
    return this.tag;
  }
  public void setMetaTitle( String value) {
    this.meta_title = value;
  }
  public String getMetaTitle() {
    return this.meta_title;
  }
  public void setMetaDescription( String value) {
    this.meta_description = value;
  }
  public String getMetaDescription() {
    return this.meta_description;
  }
  public void setMetaKeyword( String value) {
    this.meta_keyword = value;
  }
  public String getMetaKeyword() {
    return this.meta_keyword;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.tag)); 
     builder.append(String.valueOf(this.meta_title)); 
     builder.append(String.valueOf(this.meta_description)); 
     builder.append(String.valueOf(this.meta_keyword)); ;
    return builder.toString();
  }
}