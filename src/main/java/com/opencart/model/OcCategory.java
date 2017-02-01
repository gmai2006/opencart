package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_category")
public class OcCategory  {
  @Basic
  @Column(name="image" , length=255)
  private String image;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  @Basic
  @Column(name="top" )
  @NotNull
  private Boolean top;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="parent_id" , length=10)
  @NotNull
  private Integer parentId;

  @Basic
  @Column(name="column" , length=10)
  @NotNull
  private Integer column;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcCategory() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
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
  public void setTop( Boolean value) {
    this.top = value;
  }
  public Boolean getTop() {
    return this.top;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setParentId( Integer value) {
    this.parentId = value;
  }
  public Integer getParentId() {
    return this.parentId;
  }
  public void setColumn( Integer value) {
    this.column = value;
  }
  public Integer getColumn() {
    return this.column;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcCategory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCategory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCategory.class);
    }

  public static OcCategory fromArray(Object[] o) {
      OcCategory result = new OcCategory();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTop((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setParentId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setColumn((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCategory> list) {
      JsonArray array = new JsonArray();
      for (OcCategory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.top)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.parentId)); 
     builder.append(String.valueOf(this.column)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}