package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_search")
public class OcCustomerSearch  {
  @Basic
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Id
  @Column(name="customer_search_id" , length=10)
  @NotNull
  private Integer customerSearchId;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="category_id" , length=10)
  private Integer categoryId;

  @Basic
  @Column(name="sub_category" )
  @NotNull
  private Boolean subCategory;

  @Basic
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="description" )
  @NotNull
  private Boolean description;

  @Basic
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="customer_id" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="keyword" , length=255)
  @NotNull
  private String keyword;

  @Basic
  @Column(name="products" , length=10)
  @NotNull
  private Integer products;

  public OcCustomerSearch() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setCustomerSearchId( Integer value) {
    this.customerSearchId = value;
  }
  public Integer getCustomerSearchId() {
    return this.customerSearchId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setSubCategory( Boolean value) {
    this.subCategory = value;
  }
  public Boolean getSubCategory() {
    return this.subCategory;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setDescription( Boolean value) {
    this.description = value;
  }
  public Boolean getDescription() {
    return this.description;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setKeyword( String value) {
    this.keyword = value;
  }
  public String getKeyword() {
    return this.keyword;
  }
  public void setProducts( Integer value) {
    this.products = value;
  }
  public Integer getProducts() {
    return this.products;
  }

  public String toJson() {
      OcCustomerSearch obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerSearch fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerSearch.class);
    }

  public static OcCustomerSearch fromArray(Object[] o) {
      OcCustomerSearch result = new OcCustomerSearch();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerSearchId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSubCategory((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setKeyword((String)BeanUtils.getNullableValue(o[i++]));
        result.setProducts((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerSearch> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerSearch dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.customerSearchId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.subCategory)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.keyword)); 
     builder.append(String.valueOf(this.products)); ;
    return builder.toString();
  }
}