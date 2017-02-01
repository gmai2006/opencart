package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_customer_group_description")
@IdClass(value=OcCustomerGroupDescriptionId.class)
public class OcCustomerGroupDescription  {
  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="description" , length=65535)
  @NotNull
  private String description;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Id
  @Column(name="customer_group_id" , length=10)
  @NotNull
  private Integer customerGroupId;

  public OcCustomerGroupDescription() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public String toJson() {
      OcCustomerGroupDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomerGroupDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomerGroupDescription.class);
    }

  public static OcCustomerGroupDescription fromArray(Object[] o) {
      OcCustomerGroupDescription result = new OcCustomerGroupDescription();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDescription((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomerGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomerGroupDescription> list) {
      JsonArray array = new JsonArray();
      for (OcCustomerGroupDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}