
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
@Table(name="oc_review")
public class OcReview  {
  @Id
  @Column(name="\"review_id\"" , length=10)
  @NotNull
  private Integer review_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"author\"" , length=64)
  @NotNull
  private String author;

  @Basic
  @Column(name="\"text\"" , length=65535)
  @NotNull
  private String text;

  @Basic
  @Column(name="\"rating\"" , length=10)
  @NotNull
  private Integer rating;

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

  public OcReview() {
  }

  public void setReviewId( Integer value) {
    this.review_id = value;
  }
  public Integer getReviewId() {
    return this.review_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setAuthor( String value) {
    this.author = value;
  }
  public String getAuthor() {
    return this.author;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void setRating( Integer value) {
    this.rating = value;
  }
  public Integer getRating() {
    return this.rating;
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
     builder.append(String.valueOf(this.review_id)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.author)); 
     builder.append(String.valueOf(this.text)); 
     builder.append(String.valueOf(this.rating)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}