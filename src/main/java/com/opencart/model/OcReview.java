package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_review")
public class OcReview  {
  @Id
  @Column(name="review_id" , length=10)
  @NotNull
  private Integer reviewId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="author" , length=64)
  @NotNull
  private String author;

  @Basic
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="rating" , length=10)
  @NotNull
  private Integer rating;

  @Basic
  @Column(name="text" , length=65535)
  @NotNull
  private String text;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcReview() {
  }

  public void setReviewId( Integer value) {
    this.reviewId = value;
  }
  public Integer getReviewId() {
    return this.reviewId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setAuthor( String value) {
    this.author = value;
  }
  public String getAuthor() {
    return this.author;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setRating( Integer value) {
    this.rating = value;
  }
  public Integer getRating() {
    return this.rating;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcReview obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcReview fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcReview.class);
    }

  public static OcReview fromArray(Object[] o) {
      OcReview result = new OcReview();
      int i = 0;
        result.setReviewId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setAuthor((String)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setRating((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setText((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcReview> list) {
      JsonArray array = new JsonArray();
      for (OcReview dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.reviewId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.author)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.rating)); 
     builder.append(String.valueOf(this.text)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}