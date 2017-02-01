package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_tax_rate_to_customer_group")
@IdClass(value=OcTaxRateToCustomerGroupId.class)
public class OcTaxRateToCustomerGroup  {
  @Id
  @Column(name="tax_rate_id" , length=10)
  @NotNull
  private Integer taxRateId;

  @Id
  @Column(name="customer_group_id" , length=10)
  @NotNull
  private Integer customerGroupId;

  public OcTaxRateToCustomerGroup() {
  }

  public void setTaxRateId( Integer value) {
    this.taxRateId = value;
  }
  public Integer getTaxRateId() {
    return this.taxRateId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public String toJson() {
      OcTaxRateToCustomerGroup obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcTaxRateToCustomerGroup fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcTaxRateToCustomerGroup.class);
    }

  public static OcTaxRateToCustomerGroup fromArray(Object[] o) {
      OcTaxRateToCustomerGroup result = new OcTaxRateToCustomerGroup();
      int i = 0;
        result.setTaxRateId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcTaxRateToCustomerGroup> list) {
      JsonArray array = new JsonArray();
      for (OcTaxRateToCustomerGroup dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.taxRateId)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}