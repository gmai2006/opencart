package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_custom_field_customer_group")
@IdClass(value=OcCustomFieldCustomerGroupId.class)
public class OcCustomFieldCustomerGroup  {
  @Id
  @Column(name="custom_field_id" , length=10)
  @NotNull
  private Integer customFieldId;

  @Id
  @Column(name="customer_group_id" , length=10)
  @NotNull
  private Integer customerGroupId;

  @Basic
  @Column(name="required" )
  @NotNull
  private Boolean required;

  public OcCustomFieldCustomerGroup() {
  }

  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRequired() {
    return this.required;
  }

  public String toJson() {
      OcCustomFieldCustomerGroup obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomFieldCustomerGroup fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomFieldCustomerGroup.class);
    }

  public static OcCustomFieldCustomerGroup fromArray(Object[] o) {
      OcCustomFieldCustomerGroup result = new OcCustomFieldCustomerGroup();
      int i = 0;
        result.setCustomFieldId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setRequired((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomFieldCustomerGroup> list) {
      JsonArray array = new JsonArray();
      for (OcCustomFieldCustomerGroup dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.customerGroupId)); 
     builder.append(String.valueOf(this.required)); ;
    return builder.toString();
  }
}