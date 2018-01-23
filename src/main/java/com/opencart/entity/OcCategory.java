
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
@Table(name="oc_category")
public class OcCategory  {
  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer category_id;

  @Basic
  @Column(name="\"image\"" , length=255)
  private String image;

  @Basic
  @Column(name="\"parent_id\"" , length=10)
  @NotNull
  private Integer parent_id;

  @Basic
  @Column(name="\"top\"" )
  @NotNull
  private Boolean top;

  @Basic
  @Column(name="\"column\"" , length=10)
  @NotNull
  private Integer column;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcCategory() {
  }

  public void setCategoryId( Integer value) {
    this.category_id = value;
  }
  public Integer getCategoryId() {
    return this.category_id;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setParentId( Integer value) {
    this.parent_id = value;
  }
  public Integer getParentId() {
    return this.parent_id;
  }
  public void setTop( Boolean value) {
    this.top = value;
  }
  public Boolean getTop() {
    return this.top;
  }
  public void setColumn( Integer value) {
    this.column = value;
  }
  public Integer getColumn() {
    return this.column;
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
     builder.append(String.valueOf(this.category_id)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.parent_id)); 
     builder.append(String.valueOf(this.top)); 
     builder.append(String.valueOf(this.column)); 
     builder.append(String.valueOf(this.sort_order)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}