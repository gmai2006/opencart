package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product")
public class OcProduct  {
  @Basic
  @Column(name="length_class_id" , length=10)
  @NotNull
  private Integer lengthClassId;

  @Basic
  @Column(name="isbn" , length=17)
  @NotNull
  private String isbn;

  @Basic
  @Column(name="points" , length=10)
  @NotNull
  private Integer points;

  @Basic
  @Column(name="ean" , length=14)
  @NotNull
  private String ean;

  @Basic
  @Column(name="shipping" )
  @NotNull
  private Boolean shipping;

  @Basic
  @Column(name="jan" , length=13)
  @NotNull
  private String jan;

  @Basic
  @Column(name="price" , length=15)
  @NotNull
  private Long price;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="viewed" , length=10)
  @NotNull
  private Integer viewed;

  @Basic
  @Column(name="model" , length=64)
  @NotNull
  private String model;

  @Basic
  @Column(name="stock_status_id" , length=10)
  @NotNull
  private Integer stockStatusId;

  @Basic
  @Column(name="sku" , length=64)
  @NotNull
  private String sku;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="height" , length=15)
  @NotNull
  private Long height;

  @Basic
  @Column(name="image" , length=255)
  private String image;

  @Basic
  @Column(name="manufacturer_id" , length=10)
  @NotNull
  private Integer manufacturerId;

  @Basic
  @Column(name="quantity" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="subtract" )
  @NotNull
  private Boolean subtract;

  @Basic
  @Column(name="tax_class_id" , length=10)
  @NotNull
  private Integer taxClassId;

  @Basic
  @Column(name="length" , length=15)
  @NotNull
  private Long length;

  @Basic
  @Column(name="upc" , length=12)
  @NotNull
  private String upc;

  @Basic
  @Column(name="weight" , length=15)
  @NotNull
  private Long weight;

  @Basic
  @Column(name="mpn" , length=64)
  @NotNull
  private String mpn;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="width" , length=15)
  @NotNull
  private Long width;

  @Basic
  @Column(name="weight_class_id" , length=10)
  @NotNull
  private Integer weightClassId;

  @Basic
  @Column(name="location" , length=128)
  @NotNull
  private String location;

  @Basic
  @Column(name="date_available" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  //@XmlJavaTypeAdapter(SqlDateAdapter.class)
  private java.util.Date dateAvailable;

  @Basic
  @Column(name="minimum" , length=10)
  @NotNull
  private Integer minimum;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcProduct() {
  }

  public void setLengthClassId( Integer value) {
    this.lengthClassId = value;
  }
  public Integer getLengthClassId() {
    return this.lengthClassId;
  }
  public void setIsbn( String value) {
    this.isbn = value;
  }
  public String getIsbn() {
    return this.isbn;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }
  public void setEan( String value) {
    this.ean = value;
  }
  public String getEan() {
    return this.ean;
  }
  public void setShipping( Boolean value) {
    this.shipping = value;
  }
  public Boolean getShipping() {
    return this.shipping;
  }
  public void setJan( String value) {
    this.jan = value;
  }
  public String getJan() {
    return this.jan;
  }
  public void setPrice( Long value) {
    this.price = value;
  }
  public Long getPrice() {
    return this.price;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setViewed( Integer value) {
    this.viewed = value;
  }
  public Integer getViewed() {
    return this.viewed;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setStockStatusId( Integer value) {
    this.stockStatusId = value;
  }
  public Integer getStockStatusId() {
    return this.stockStatusId;
  }
  public void setSku( String value) {
    this.sku = value;
  }
  public String getSku() {
    return this.sku;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setHeight( Long value) {
    this.height = value;
  }
  public Long getHeight() {
    return this.height;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setManufacturerId( Integer value) {
    this.manufacturerId = value;
  }
  public Integer getManufacturerId() {
    return this.manufacturerId;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setSubtract( Boolean value) {
    this.subtract = value;
  }
  public Boolean getSubtract() {
    return this.subtract;
  }
  public void setTaxClassId( Integer value) {
    this.taxClassId = value;
  }
  public Integer getTaxClassId() {
    return this.taxClassId;
  }
  public void setLength( Long value) {
    this.length = value;
  }
  public Long getLength() {
    return this.length;
  }
  public void setUpc( String value) {
    this.upc = value;
  }
  public String getUpc() {
    return this.upc;
  }
  public void setWeight( Long value) {
    this.weight = value;
  }
  public Long getWeight() {
    return this.weight;
  }
  public void setMpn( String value) {
    this.mpn = value;
  }
  public String getMpn() {
    return this.mpn;
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
  public void setWidth( Long value) {
    this.width = value;
  }
  public Long getWidth() {
    return this.width;
  }
  public void setWeightClassId( Integer value) {
    this.weightClassId = value;
  }
  public Integer getWeightClassId() {
    return this.weightClassId;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setDateAvailable( java.util.Date value) {
    this.dateAvailable = value;
  }
  public java.util.Date getDateAvailable() {
    return this.dateAvailable;
  }
  public void setMinimum( Integer value) {
    this.minimum = value;
  }
  public Integer getMinimum() {
    return this.minimum;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcProduct obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProduct fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProduct.class);
    }

  public static OcProduct fromArray(Object[] o) {
      OcProduct result = new OcProduct();
      int i = 0;
        result.setLengthClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setIsbn((String)BeanUtils.getNullableValue(o[i++]));
        result.setPoints((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setEan((String)BeanUtils.getNullableValue(o[i++]));
        result.setShipping((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setJan((String)BeanUtils.getNullableValue(o[i++]));
        result.setPrice((Long)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setViewed((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setModel((String)BeanUtils.getNullableValue(o[i++]));
        result.setStockStatusId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSku((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setHeight((Long)BeanUtils.getNullableValue(o[i++]));
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setManufacturerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setQuantity((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSubtract((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setTaxClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLength((Long)BeanUtils.getNullableValue(o[i++]));
        result.setUpc((String)BeanUtils.getNullableValue(o[i++]));
        result.setWeight((Long)BeanUtils.getNullableValue(o[i++]));
        result.setMpn((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setWidth((Long)BeanUtils.getNullableValue(o[i++]));
        result.setWeightClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLocation((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAvailable((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setMinimum((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProduct> list) {
      JsonArray array = new JsonArray();
      for (OcProduct dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.lengthClassId)); 
     builder.append(String.valueOf(this.isbn)); 
     builder.append(String.valueOf(this.points)); 
     builder.append(String.valueOf(this.ean)); 
     builder.append(String.valueOf(this.shipping)); 
     builder.append(String.valueOf(this.jan)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.viewed)); 
     builder.append(String.valueOf(this.model)); 
     builder.append(String.valueOf(this.stockStatusId)); 
     builder.append(String.valueOf(this.sku)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.height)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.manufacturerId)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.subtract)); 
     builder.append(String.valueOf(this.taxClassId)); 
     builder.append(String.valueOf(this.length)); 
     builder.append(String.valueOf(this.upc)); 
     builder.append(String.valueOf(this.weight)); 
     builder.append(String.valueOf(this.mpn)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.width)); 
     builder.append(String.valueOf(this.weightClassId)); 
     builder.append(String.valueOf(this.location)); 
     builder.append(String.valueOf(this.dateAvailable)); 
     builder.append(String.valueOf(this.minimum)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}