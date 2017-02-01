package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_tax_rule")
public class OcTaxRule  {
  @Basic
  @Column(name="tax_rate_id" , length=10)
  @NotNull
  private Integer taxRateId;

  @Basic
  @Column(name="based" , length=10)
  @NotNull
  private String based;

  @Basic
  @Column(name="tax_class_id" , length=10)
  @NotNull
  private Integer taxClassId;

  @Basic
  @Column(name="priority" , length=10)
  @NotNull
  private Integer priority;

  @Id
  @Column(name="tax_rule_id" , length=10)
  @NotNull
  private Integer taxRuleId;

  public OcTaxRule() {
  }

  public void setTaxRateId( Integer value) {
    this.taxRateId = value;
  }
  public Integer getTaxRateId() {
    return this.taxRateId;
  }
  public void setBased( String value) {
    this.based = value;
  }
  public String getBased() {
    return this.based;
  }
  public void setTaxClassId( Integer value) {
    this.taxClassId = value;
  }
  public Integer getTaxClassId() {
    return this.taxClassId;
  }
  public void setPriority( Integer value) {
    this.priority = value;
  }
  public Integer getPriority() {
    return this.priority;
  }
  public void setTaxRuleId( Integer value) {
    this.taxRuleId = value;
  }
  public Integer getTaxRuleId() {
    return this.taxRuleId;
  }

  public String toJson() {
      OcTaxRule obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcTaxRule fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcTaxRule.class);
    }

  public static OcTaxRule fromArray(Object[] o) {
      OcTaxRule result = new OcTaxRule();
      int i = 0;
        result.setTaxRateId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setBased((String)BeanUtils.getNullableValue(o[i++]));
        result.setTaxClassId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPriority((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setTaxRuleId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcTaxRule> list) {
      JsonArray array = new JsonArray();
      for (OcTaxRule dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.taxRateId)); 
     builder.append(String.valueOf(this.based)); 
     builder.append(String.valueOf(this.taxClassId)); 
     builder.append(String.valueOf(this.priority)); 
     builder.append(String.valueOf(this.taxRuleId)); ;
    return builder.toString();
  }
}