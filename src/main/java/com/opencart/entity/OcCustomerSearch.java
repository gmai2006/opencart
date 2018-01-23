
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
@Table(name="oc_customer_search")
public class OcCustomerSearch  {
  @Id
  @Column(name="\"customer_search_id\"" , length=10)
  @NotNull
  private Integer customer_search_id;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"keyword\"" , length=255)
  @NotNull
  private String keyword;

  @Basic
  @Column(name="\"category_id\"" , length=10)
  private Integer category_id;

  @Basic
  @Column(name="\"sub_category\"" )
  @NotNull
  private Boolean sub_category;

  @Basic
  @Column(name="\"description\"" )
  @NotNull
  private Boolean description;

  @Basic
  @Column(name="\"products\"" , length=10)
  @NotNull
  private Integer products;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  public OcCustomerSearch() {
  }

  public void setCustomerSearchId( Integer value) {
    this.customer_search_id = value;
  }
  public Integer getCustomerSearchId() {
    return this.customer_search_id;
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
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setKeyword( String value) {
    this.keyword = value;
  }
  public String getKeyword() {
    return this.keyword;
  }
  public void setCategoryId( Integer value) {
    this.category_id = value;
  }
  public Integer getCategoryId() {
    return this.category_id;
  }
  public void setSubCategory( Boolean value) {
    this.sub_category = value;
  }
  public Boolean getSubCategory() {
    return this.sub_category;
  }
  public void setDescription( Boolean value) {
    this.description = value;
  }
  public Boolean getDescription() {
    return this.description;
  }
  public void setProducts( Integer value) {
    this.products = value;
  }
  public Integer getProducts() {
    return this.products;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customer_search_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.keyword)); 
     builder.append(String.valueOf(this.category_id)); 
     builder.append(String.valueOf(this.sub_category)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.products)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.date_added)); ;
    return builder.toString();
  }
}