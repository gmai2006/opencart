package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_coupon")
public class OcCoupon  {
  @Basic
  @Column(name="code" , length=20)
  @NotNull
  private String code;

  @Basic
  @Column(name="discount" , length=15)
  @NotNull
  private Long discount;

  @Basic
  @Column(name="date_end" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  //@XmlJavaTypeAdapter(SqlDateAdapter.class)
  private java.util.Date dateEnd;

  @Basic
  @Column(name="type" , length=1)
  @NotNull
  private String type;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="total" , length=15)
  @NotNull
  private Long total;

  @Basic
  @Column(name="date_start" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  //@XmlJavaTypeAdapter(SqlDateAdapter.class)
  private java.util.Date dateStart;

  @Id
  @Column(name="coupon_id" , length=10)
  @NotNull
  private Integer couponId;

  @Basic
  @Column(name="shipping" )
  @NotNull
  private Boolean shipping;

  @Basic
  @Column(name="uses_total" , length=10)
  @NotNull
  private Integer usesTotal;

  @Basic
  @Column(name="logged" )
  @NotNull
  private Boolean logged;

  @Basic
  @Column(name="name" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="uses_customer" , length=11)
  @NotNull
  private String usesCustomer;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcCoupon() {
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDiscount( Long value) {
    this.discount = value;
  }
  public Long getDiscount() {
    return this.discount;
  }
  public void setDateEnd( java.util.Date value) {
    this.dateEnd = value;
  }
  public java.util.Date getDateEnd() {
    return this.dateEnd;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setTotal( Long value) {
    this.total = value;
  }
  public Long getTotal() {
    return this.total;
  }
  public void setDateStart( java.util.Date value) {
    this.dateStart = value;
  }
  public java.util.Date getDateStart() {
    return this.dateStart;
  }
  public void setCouponId( Integer value) {
    this.couponId = value;
  }
  public Integer getCouponId() {
    return this.couponId;
  }
  public void setShipping( Boolean value) {
    this.shipping = value;
  }
  public Boolean getShipping() {
    return this.shipping;
  }
  public void setUsesTotal( Integer value) {
    this.usesTotal = value;
  }
  public Integer getUsesTotal() {
    return this.usesTotal;
  }
  public void setLogged( Boolean value) {
    this.logged = value;
  }
  public Boolean getLogged() {
    return this.logged;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setUsesCustomer( String value) {
    this.usesCustomer = value;
  }
  public String getUsesCustomer() {
    return this.usesCustomer;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcCoupon obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCoupon fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCoupon.class);
    }

  public static OcCoupon fromArray(Object[] o) {
      OcCoupon result = new OcCoupon();
      int i = 0;
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setDiscount((Long)BeanUtils.getNullableValue(o[i++]));
        result.setDateEnd((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setTotal((Long)BeanUtils.getNullableValue(o[i++]));
        result.setDateStart((java.util.Date)BeanUtils.getNullableValue(o[i++]));
        result.setCouponId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setShipping((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setUsesTotal((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLogged((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setUsesCustomer((String)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCoupon> list) {
      JsonArray array = new JsonArray();
      for (OcCoupon dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.discount)); 
     builder.append(String.valueOf(this.dateEnd)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.dateStart)); 
     builder.append(String.valueOf(this.couponId)); 
     builder.append(String.valueOf(this.shipping)); 
     builder.append(String.valueOf(this.usesTotal)); 
     builder.append(String.valueOf(this.logged)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.usesCustomer)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}