
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
@Table(name="oc_translation")
public class OcTranslation  {
  @Id
  @Column(name="\"translation_id\"" , length=10)
  @NotNull
  private Integer translation_id;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"route\"" , length=64)
  @NotNull
  private String route;

  @Basic
  @Column(name="\"key\"" , length=64)
  @NotNull
  private String key;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  public OcTranslation() {
  }

  public void setTranslationId( Integer value) {
    this.translation_id = value;
  }
  public Integer getTranslationId() {
    return this.translation_id;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.translation_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.route)); 
     builder.append(String.valueOf(this.key)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}