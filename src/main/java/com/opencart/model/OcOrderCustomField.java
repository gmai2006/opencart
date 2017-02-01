package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_order_custom_field")
public class OcOrderCustomField  {
  @Id
  @Column(name="order_custom_field_id" , length=10)
  @NotNull
  private Integer orderCustomFieldId;

  @Basic
  @Column(name="custom_field_id" , length=10)
  @NotNull
  private Integer customFieldId;

  @Basic
  @Column(name="name" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="location" , length=16)
  @NotNull
  private String location;

  @Basic
  @Column(name="custom_field_value_id" , length=10)
  @NotNull
  private Integer customFieldValueId;

  @Basic
  @Column(name="type" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="order_id" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="value" , length=65535)
  @NotNull
  private String value;

  public OcOrderCustomField() {
  }

  public void setOrderCustomFieldId( Integer value) {
    this.orderCustomFieldId = value;
  }
  public Integer getOrderCustomFieldId() {
    return this.orderCustomFieldId;
  }
  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setCustomFieldValueId( Integer value) {
    this.customFieldValueId = value;
  }
  public Integer getCustomFieldValueId() {
    return this.customFieldValueId;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }

  public String toJson() {
      OcOrderCustomField obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOrderCustomField fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOrderCustomField.class);
    }

  public static OcOrderCustomField fromArray(Object[] o) {
      OcOrderCustomField result = new OcOrderCustomField();
      int i = 0;
        result.setOrderCustomFieldId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomFieldId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLocation((String)BeanUtils.getNullableValue(o[i++]));
        result.setCustomFieldValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
        result.setOrderId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValue((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOrderCustomField> list) {
      JsonArray array = new JsonArray();
      for (OcOrderCustomField dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.orderCustomFieldId)); 
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.location)); 
     builder.append(String.valueOf(this.customFieldValueId)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}