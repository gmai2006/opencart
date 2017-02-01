package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_group")
public class OcCustomerGroup  {
  @Basic
  @Column(name="approval" , length=10)
  @NotNull
  private Integer approval;

  @Id
  @Column(name="customer_group_id" , length=10)
  @NotNull
  private Integer customerGroupId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcCustomerGroup() {
  }

  public void setApproval( Integer value) {
    this.approval = value;
  }
  public Integer getApproval() {
    return this.approval;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcCustomerGroup obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerGroup fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerGroup.class);
    }

  public static OcCustomerGroup fromArray(Object[] o) {
      OcCustomerGroup result = new OcCustomerGroup();
      int i = 0;
        result.setApproval((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerGroup> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerGroup dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.approval)); 
     builder.append(String.valueOf(this.customerGroupId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}