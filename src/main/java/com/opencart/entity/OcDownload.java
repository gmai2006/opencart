
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
@Table(name="oc_download")
public class OcDownload  {
  @Id
  @Column(name="\"download_id\"" , length=10)
  @NotNull
  private Integer download_id;

  @Basic
  @Column(name="\"filename\"" , length=160)
  @NotNull
  private String filename;

  @Basic
  @Column(name="\"mask\"" , length=128)
  @NotNull
  private String mask;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcDownload() {
  }

  public void setDownloadId( Integer value) {
    this.download_id = value;
  }
  public Integer getDownloadId() {
    return this.download_id;
  }
  public void setFilename( String value) {
    this.filename = value;
  }
  public String getFilename() {
    return this.filename;
  }
  public void setMask( String value) {
    this.mask = value;
  }
  public String getMask() {
    return this.mask;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.download_id)); 
     builder.append(String.valueOf(this.filename)); 
     builder.append(String.valueOf(this.mask)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}