package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_custom_field_value")
public class OcCustomFieldValue  {
  @Basic
  @Column(name="custom_field_id" , length=10)
  @NotNull
  private Integer customFieldId;

  @Id
  @Column(name="custom_field_value_id" , length=10)
  @NotNull
  private Integer customFieldValueId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcCustomFieldValue() {
  }

  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setCustomFieldValueId( Integer value) {
    this.customFieldValueId = value;
  }
  public Integer getCustomFieldValueId() {
    return this.customFieldValueId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcCustomFieldValue obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomFieldValue fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomFieldValue.class);
    }

  public static OcCustomFieldValue fromArray(Object[] o) {
      OcCustomFieldValue result = new OcCustomFieldValue();
      int i = 0;
        result.setCustomFieldId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCustomFieldValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomFieldValue> list) {
      JsonArray array = new JsonArray();
      for (OcCustomFieldValue dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.customFieldValueId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}