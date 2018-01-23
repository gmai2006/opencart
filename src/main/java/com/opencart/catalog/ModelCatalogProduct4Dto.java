package com.opencart.catalog;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCatalogProduct4Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCatalogProduct4Dto.class.getName());

  private Integer product_id ;
  private String model ;
  private String sku ;
  private String upc ;
  private String ean ;
  private String jan ;
  private String isbn ;
  private String mpn ;
  private String location ;
  private Integer quantity ;
  private Integer stock_status_id ;
  private String image ;
  private Integer manufacturer_id ;
  private Boolean shipping ;
  private java.math.BigDecimal price ;
  private Integer points ;
  private Integer tax_class_id ;
  private java.util.Date date_available ;
  private java.math.BigDecimal weight ;
  private Integer weight_class_id ;
  private java.math.BigDecimal length ;
  private java.math.BigDecimal width ;
  private java.math.BigDecimal height ;
  private Integer length_class_id ;
  private Boolean subtract ;
  private Integer minimum ;
  private Integer sort_order ;
  private Boolean status ;
  private Integer viewed ;
  private java.sql.Timestamp date_added ;
  private java.sql.Timestamp date_modified ;
  private Integer product_id0 ;
  private Integer language_id ;
  private String name ;
  private String description ;
  private String tag ;
  private String meta_title ;
  private String meta_description ;
  private String meta_keyword ;
  private Integer product_id01 ;
  private Integer store_id ;
  private Integer manufacturer_id0 ;
  private String name0 ;
  private String image0 ;
  private Integer sort_order0 ;
  private String name01 ;
  private String image01 ;
  private String manufacturer ;
  private String discount ;
  private String special ;
  private String reward ;
  private String stock_status ;
  private String weight_class ;
  private String length_class ;
  private String rating ;
  private String reviews ;
  private Integer sort_order01 ;

  public Integer getProduct_id() {
    return this.product_id;
  }
  public void setProduct_id( Integer value) {
    this.product_id = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getSku() {
    return this.sku;
  }
  public void setSku( String value) {
    this.sku = value;
  }
  public String getUpc() {
    return this.upc;
  }
  public void setUpc( String value) {
    this.upc = value;
  }
  public String getEan() {
    return this.ean;
  }
  public void setEan( String value) {
    this.ean = value;
  }
  public String getJan() {
    return this.jan;
  }
  public void setJan( String value) {
    this.jan = value;
  }
  public String getIsbn() {
    return this.isbn;
  }
  public void setIsbn( String value) {
    this.isbn = value;
  }
  public String getMpn() {
    return this.mpn;
  }
  public void setMpn( String value) {
    this.mpn = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getStock_status_id() {
    return this.stock_status_id;
  }
  public void setStock_status_id( Integer value) {
    this.stock_status_id = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public Integer getManufacturer_id() {
    return this.manufacturer_id;
  }
  public void setManufacturer_id( Integer value) {
    this.manufacturer_id = value;
  }
  public Boolean getShipping() {
    return this.shipping;
  }
  public void setShipping( Boolean value) {
    this.shipping = value;
  }
  public java.math.BigDecimal getPrice() {
    return this.price;
  }
  public void setPrice( java.math.BigDecimal value) {
    this.price = value;
  }
  public Integer getPoints() {
    return this.points;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getTax_class_id() {
    return this.tax_class_id;
  }
  public void setTax_class_id( Integer value) {
    this.tax_class_id = value;
  }
  public java.util.Date getDate_available() {
    return this.date_available;
  }
  public void setDate_available( java.util.Date value) {
    this.date_available = value;
  }
  public java.math.BigDecimal getWeight() {
    return this.weight;
  }
  public void setWeight( java.math.BigDecimal value) {
    this.weight = value;
  }
  public Integer getWeight_class_id() {
    return this.weight_class_id;
  }
  public void setWeight_class_id( Integer value) {
    this.weight_class_id = value;
  }
  public java.math.BigDecimal getLength() {
    return this.length;
  }
  public void setLength( java.math.BigDecimal value) {
    this.length = value;
  }
  public java.math.BigDecimal getWidth() {
    return this.width;
  }
  public void setWidth( java.math.BigDecimal value) {
    this.width = value;
  }
  public java.math.BigDecimal getHeight() {
    return this.height;
  }
  public void setHeight( java.math.BigDecimal value) {
    this.height = value;
  }
  public Integer getLength_class_id() {
    return this.length_class_id;
  }
  public void setLength_class_id( Integer value) {
    this.length_class_id = value;
  }
  public Boolean getSubtract() {
    return this.subtract;
  }
  public void setSubtract( Boolean value) {
    this.subtract = value;
  }
  public Integer getMinimum() {
    return this.minimum;
  }
  public void setMinimum( Integer value) {
    this.minimum = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Boolean getStatus() {
    return this.status;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Integer getViewed() {
    return this.viewed;
  }
  public void setViewed( Integer value) {
    this.viewed = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDate_modified() {
    return this.date_modified;
  }
  public void setDate_modified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public Integer getProduct_id0() {
    return this.product_id0;
  }
  public void setProduct_id0( Integer value) {
    this.product_id0 = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getTag() {
    return this.tag;
  }
  public void setTag( String value) {
    this.tag = value;
  }
  public String getMeta_title() {
    return this.meta_title;
  }
  public void setMeta_title( String value) {
    this.meta_title = value;
  }
  public String getMeta_description() {
    return this.meta_description;
  }
  public void setMeta_description( String value) {
    this.meta_description = value;
  }
  public String getMeta_keyword() {
    return this.meta_keyword;
  }
  public void setMeta_keyword( String value) {
    this.meta_keyword = value;
  }
  public Integer getProduct_id01() {
    return this.product_id01;
  }
  public void setProduct_id01( Integer value) {
    this.product_id01 = value;
  }
  public Integer getStore_id() {
    return this.store_id;
  }
  public void setStore_id( Integer value) {
    this.store_id = value;
  }
  public Integer getManufacturer_id0() {
    return this.manufacturer_id0;
  }
  public void setManufacturer_id0( Integer value) {
    this.manufacturer_id0 = value;
  }
  public String getName0() {
    return this.name0;
  }
  public void setName0( String value) {
    this.name0 = value;
  }
  public String getImage0() {
    return this.image0;
  }
  public void setImage0( String value) {
    this.image0 = value;
  }
  public Integer getSort_order0() {
    return this.sort_order0;
  }
  public void setSort_order0( Integer value) {
    this.sort_order0 = value;
  }
  public String getName01() {
    return this.name01;
  }
  public void setName01( String value) {
    this.name01 = value;
  }
  public String getImage01() {
    return this.image01;
  }
  public void setImage01( String value) {
    this.image01 = value;
  }
  public String getManufacturer() {
    return this.manufacturer;
  }
  public void setManufacturer( String value) {
    this.manufacturer = value;
  }
  public String getDiscount() {
    return this.discount;
  }
  public void setDiscount( String value) {
    this.discount = value;
  }
  public String getSpecial() {
    return this.special;
  }
  public void setSpecial( String value) {
    this.special = value;
  }
  public String getReward() {
    return this.reward;
  }
  public void setReward( String value) {
    this.reward = value;
  }
  public String getStock_status() {
    return this.stock_status;
  }
  public void setStock_status( String value) {
    this.stock_status = value;
  }
  public String getWeight_class() {
    return this.weight_class;
  }
  public void setWeight_class( String value) {
    this.weight_class = value;
  }
  public String getLength_class() {
    return this.length_class;
  }
  public void setLength_class( String value) {
    this.length_class = value;
  }
  public String getRating() {
    return this.rating;
  }
  public void setRating( String value) {
    this.rating = value;
  }
  public String getReviews() {
    return this.reviews;
  }
  public void setReviews( String value) {
    this.reviews = value;
  }
  public Integer getSort_order01() {
    return this.sort_order01;
  }
  public void setSort_order01( Integer value) {
    this.sort_order01 = value;
  }

  public static ModelCatalogProduct4Dto fromArray(Object[] o) {
    ModelCatalogProduct4Dto result = new ModelCatalogProduct4Dto();
    int i = 0;
    result.setProduct_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setModel((String)DaoUtils.getNullableValue(o[i++]));
    result.setSku((String)DaoUtils.getNullableValue(o[i++]));
    result.setUpc((String)DaoUtils.getNullableValue(o[i++]));
    result.setEan((String)DaoUtils.getNullableValue(o[i++]));
    result.setJan((String)DaoUtils.getNullableValue(o[i++]));
    result.setIsbn((String)DaoUtils.getNullableValue(o[i++]));
    result.setMpn((String)DaoUtils.getNullableValue(o[i++]));
    result.setLocation((String)DaoUtils.getNullableValue(o[i++]));
    result.setQuantity((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStock_status_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setManufacturer_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setShipping((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setPrice((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setPoints((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTax_class_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setDate_available((java.util.Date)DaoUtils.getNullableValue(o[i++]));
    result.setWeight((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setWeight_class_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLength((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setWidth((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setHeight((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setLength_class_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setSubtract((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setMinimum((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((Boolean)DaoUtils.getNullableValue(o[i++]));
    result.setViewed((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setDate_modified((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setDescription((String)DaoUtils.getNullableValue(o[i++]));
    result.setTag((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_title((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_description((String)DaoUtils.getNullableValue(o[i++]));
    result.setMeta_keyword((String)DaoUtils.getNullableValue(o[i++]));
    result.setProduct_id01((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStore_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setManufacturer_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName0((String)DaoUtils.getNullableValue(o[i++]));
    result.setImage0((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName01((String)DaoUtils.getNullableValue(o[i++]));
    result.setImage01((String)DaoUtils.getNullableValue(o[i++]));
    result.setManufacturer((String)DaoUtils.getNullableValue(o[i++]));
    result.setDiscount((String)DaoUtils.getNullableValue(o[i++]));
    result.setSpecial((String)DaoUtils.getNullableValue(o[i++]));
    result.setReward((String)DaoUtils.getNullableValue(o[i++]));
    result.setStock_status((String)DaoUtils.getNullableValue(o[i++]));
    result.setWeight_class((String)DaoUtils.getNullableValue(o[i++]));
    result.setLength_class((String)DaoUtils.getNullableValue(o[i++]));
    result.setRating((String)DaoUtils.getNullableValue(o[i++]));
    result.setReviews((String)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order01((Integer)DaoUtils.getNullableValue(o[i++]));
    return result;
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
    builder.append(String.valueOf(this.date_modified)); 
    builder.append(String.valueOf(this.product_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.description)); 
    builder.append(String.valueOf(this.tag)); 
    builder.append(String.valueOf(this.meta_title)); 
    builder.append(String.valueOf(this.meta_description)); 
    builder.append(String.valueOf(this.meta_keyword)); 
    builder.append(String.valueOf(this.product_id01)); 
    builder.append(String.valueOf(this.store_id)); 
    builder.append(String.valueOf(this.manufacturer_id0)); 
    builder.append(String.valueOf(this.name0)); 
    builder.append(String.valueOf(this.image0)); 
    builder.append(String.valueOf(this.sort_order0)); 
    builder.append(String.valueOf(this.name01)); 
    builder.append(String.valueOf(this.image01)); 
    builder.append(String.valueOf(this.manufacturer)); 
    builder.append(String.valueOf(this.discount)); 
    builder.append(String.valueOf(this.special)); 
    builder.append(String.valueOf(this.reward)); 
    builder.append(String.valueOf(this.stock_status)); 
    builder.append(String.valueOf(this.weight_class)); 
    builder.append(String.valueOf(this.length_class)); 
    builder.append(String.valueOf(this.rating)); 
    builder.append(String.valueOf(this.reviews)); 
    builder.append(String.valueOf(this.sort_order01)); ;
    return builder.toString();
  }
}