
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
@Table(name="oc_language")
public class OcLanguage  {
  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"code\"" , length=5)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"locale\"" , length=255)
  @NotNull
  private String locale;

  @Basic
  @Column(name="\"image\"" , length=64)
  @NotNull
  private String image;

  @Basic
  @Column(name="\"directory\"" , length=32)
  @NotNull
  private String directory;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcLanguage() {
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
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setLocale( String value) {
    this.locale = value;
  }
  public String getLocale() {
    return this.locale;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setDirectory( String value) {
    this.directory = value;
  }
  public String getDirectory() {
    return this.directory;
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
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.locale)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.directory)); 
     builder.append(String.valueOf(this.sort_order)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}