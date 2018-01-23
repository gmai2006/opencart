
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
@Table(name="oc_information_description")
@IdClass(value=OcInformationDescriptionId.class)
public class OcInformationDescription  {
  @Id
  @Column(name="\"information_id\"" , length=10)
  @NotNull
  private Integer information_id;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"title\"" , length=64)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"description\"" , length=16777215)
  @NotNull
  private String description;

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

  public OcInformationDescription() {
  }

  public void setInformationId( Integer value) {
    this.information_id = value;
  }
  public Integer getInformationId() {
    return this.information_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
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
     builder.append(String.valueOf(this.information_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.meta_title)); 
     builder.append(String.valueOf(this.meta_description)); 
     builder.append(String.valueOf(this.meta_keyword)); ;
    return builder.toString();
  }
}