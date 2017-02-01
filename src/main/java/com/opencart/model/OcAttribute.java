package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_attribute")
public class OcAttribute  {
  @Basic
  @Column(name="attribute_group_id" , length=10)
  @NotNull
  private Integer attributeGroupId;

  @Id
  @Column(name="attribute_id" , length=10)
  @NotNull
  private Integer attributeId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcAttribute() {
  }

  public void setAttributeGroupId( Integer value) {
    this.attributeGroupId = value;
  }
  public Integer getAttributeGroupId() {
    return this.attributeGroupId;
  }
  public void setAttributeId( Integer value) {
    this.attributeId = value;
  }
  public Integer getAttributeId() {
    return this.attributeId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcAttribute obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAttribute fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAttribute.class);
    }

  public static OcAttribute fromArray(Object[] o) {
      OcAttribute result = new OcAttribute();
      int i = 0;
        result.setAttributeGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setAttributeId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAttribute> list) {
      JsonArray array = new JsonArray();
      for (OcAttribute dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attributeGroupId)); 
     builder.append(String.valueOf(this.attributeId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}