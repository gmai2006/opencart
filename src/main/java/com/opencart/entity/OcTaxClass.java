
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
@Table(name="oc_tax_class")
public class OcTaxClass  {
  @Id
  @Column(name="\"tax_class_id\"" , length=10)
  @NotNull
  private Integer tax_class_id;

  @Basic
  @Column(name="\"title\"" , length=32)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"description\"" , length=255)
  @NotNull
  private String description;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcTaxClass() {
  }

  public void setTaxClassId( Integer value) {
    this.tax_class_id = value;
  }
  public Integer getTaxClassId() {
    return this.tax_class_id;
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
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.date_modified;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.tax_class_id)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}