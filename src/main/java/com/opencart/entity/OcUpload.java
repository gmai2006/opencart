
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
@Table(name="oc_upload")
public class OcUpload  {
  @Id
  @Column(name="\"upload_id\"" , length=10)
  @NotNull
  private Integer upload_id;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"filename\"" , length=255)
  @NotNull
  private String filename;

  @Basic
  @Column(name="\"code\"" , length=255)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcUpload() {
  }

  public void setUploadId( Integer value) {
    this.upload_id = value;
  }
  public Integer getUploadId() {
    return this.upload_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setFilename( String value) {
    this.filename = value;
  }
  public String getFilename() {
    return this.filename;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.upload_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.filename)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}