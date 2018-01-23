
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
@Table(name="oc_product")
public class OcProduct  {
  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"model\"" , length=64)
  @NotNull
  private String model;

  @Basic
  @Column(name="\"sku\"" , length=64)
  @NotNull
  private String sku;

  @Basic
  @Column(name="\"upc\"" , length=12)
  @NotNull
  private String upc;

  @Basic
  @Column(name="\"ean\"" , length=14)
  @NotNull
  private String ean;

  @Basic
  @Column(name="\"jan\"" , length=13)
  @NotNull
  private String jan;

  @Basic
  @Column(name="\"isbn\"" , length=17)
  @NotNull
  private String isbn;

  @Basic
  @Column(name="\"mpn\"" , length=64)
  @NotNull
  private String mpn;

  @Basic
  @Column(name="\"location\"" , length=128)
  @NotNull
  private String location;

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"stock_status_id\"" , length=10)
  @NotNull
  private Integer stock_status_id;

  @Basic
  @Column(name="\"image\"" , length=255)
  private String image;

  @Basic
  @Column(name="\"manufacturer_id\"" , length=10)
  @NotNull
  private Integer manufacturer_id;

  @Basic
  @Column(name="\"shipping\"" )
  @NotNull
  private Boolean shipping = true;

  @Basic
  @Column(name="\"price\"" , length=15)
  @NotNull
  private java.math.BigDecimal price = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"points\"" , length=10)
  @NotNull
  private Integer points;

  @Basic
  @Column(name="\"tax_class_id\"" , length=10)
  @NotNull
  private Integer tax_class_id;

  @Basic
  @Column(name="\"date_available\"" , length=10)
  @NotNull
  private java.util.Date date_available = new java.util.Date();

  @Basic
  @Column(name="\"weight\"" , length=15)
  @NotNull
  private java.math.BigDecimal weight = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"weight_class_id\"" , length=10)
  @NotNull
  private Integer weight_class_id;

  @Basic
  @Column(name="\"length\"" , length=15)
  @NotNull
  private java.math.BigDecimal length = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"width\"" , length=15)
  @NotNull
  private java.math.BigDecimal width = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"height\"" , length=15)
  @NotNull
  private java.math.BigDecimal height = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"length_class_id\"" , length=10)
  @NotNull
  private Integer length_class_id;

  @Basic
  @Column(name="\"subtract\"" )
  @NotNull
  private Boolean subtract = true;

  @Basic
  @Column(name="\"minimum\"" , length=10)
  @NotNull
  private Integer minimum = 1;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  @Basic
  @Column(name="\"viewed\"" , length=10)
  @NotNull
  private Integer viewed;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcProduct() {
  }

  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setSku( String value) {
    this.sku = value;
  }
  public String getSku() {
    return this.sku;
  }
  public void setUpc( String value) {
    this.upc = value;
  }
  public String getUpc() {
    return this.upc;
  }
  public void setEan( String value) {
    this.ean = value;
  }
  public String getEan() {
    return this.ean;
  }
  public void setJan( String value) {
    this.jan = value;
  }
  public String getJan() {
    return this.jan;
  }
  public void setIsbn( String value) {
    this.isbn = value;
  }
  public String getIsbn() {
    return this.isbn;
  }
  public void setMpn( String value) {
    this.mpn = value;
  }
  public String getMpn() {
    return this.mpn;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setStockStatusId( Integer value) {
    this.stock_status_id = value;
  }
  public Integer getStockStatusId() {
    return this.stock_status_id;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setManufacturerId( Integer value) {
    this.manufacturer_id = value;
  }
  public Integer getManufacturerId() {
    return this.manufacturer_id;
  }
  public void setShipping( Boolean value) {
    this.shipping = value;
  }
  public Boolean getShipping() {
    return this.shipping;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }
  public void setTaxClassId( Integer value) {
    this.tax_class_id = value;
  }
  public Integer getTaxClassId() {
    return this.tax_class_id;
  }
  public void setDateAvailable( java.util.Date value) {
    this.date_available = value;
  }
  public java.util.Date getDateAvailable() {
    return this.date_available;
  }
  public void setWeight( java.math.BigDecimal value) {
    this.weight = value;
  }
  public java.math.BigDecimal getWeight() {
    return this.weight;
  }
  public void setWeightClassId( Integer value) {
    this.weight_class_id = value;
  }
  public Integer getWeightClassId() {
    return this.weight_class_id;
  }
  public void setLength( java.math.BigDecimal value) {
    this.length = value;
  }
  public java.math.BigDecimal getLength() {
    return this.length;
  }
  public void setWidth( java.math.BigDecimal value) {
    this.width = value;
  }
  public java.math.BigDecimal getWidth() {
    return this.width;
  }
  public void setHeight( java.math.BigDecimal value) {
    this.height = value;
  }
  public java.math.BigDecimal getHeight() {
    return this.height;
  }
  public void setLengthClassId( Integer value) {
    this.length_class_id = value;
  }
  public Integer getLengthClassId() {
    return this.length_class_id;
  }
  public void setSubtract( Boolean value) {
    this.subtract = value;
  }
  public Boolean getSubtract() {
    return this.subtract;
  }
  public void setMinimum( Integer value) {
    this.minimum = value;
  }
  public Integer getMinimum() {
    return this.minimum;
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
  public void setViewed( Integer value) {
    this.viewed = value;
  }
  public Integer getViewed() {
    return this.viewed;
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
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.model)); 
     builder.append(String.valueOf(this.sku)); 
     builder.append(String.valueOf(this.upc)); 
     builder.append(String.valueOf(this.ean)); 
     builder.append(String.valueOf(this.jan)); 
     builder.append(String.valueOf(this.isbn)); 
     builder.append(String.valueOf(this.mpn)); 
     builder.append(String.valueOf(this.location)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.stock_status_id)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.manufacturer_id)); 
     builder.append(String.valueOf(this.shipping)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.points)); 
     builder.append(String.valueOf(this.tax_class_id)); 
     builder.append(String.valueOf(this.date_available)); 
     builder.append(String.valueOf(this.weight)); 
     builder.append(String.valueOf(this.weight_class_id)); 
     builder.append(String.valueOf(this.length)); 
     builder.append(String.valueOf(this.width)); 
     builder.append(String.valueOf(this.height)); 
     builder.append(String.valueOf(this.length_class_id)); 
     builder.append(String.valueOf(this.subtract)); 
     builder.append(String.valueOf(this.minimum)); 
     builder.append(String.valueOf(this.sort_order)); 
     builder.append(String.valueOf(this.status)); 
     builder.append(String.valueOf(this.viewed)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}