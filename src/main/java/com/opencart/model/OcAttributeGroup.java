package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_attribute_group")
public class OcAttributeGroup  {
  @Id
  @Column(name="attribute_group_id" , length=10)
  @NotNull
  private Integer attributeGroupId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcAttributeGroup() {
  }

  public void setAttributeGroupId( Integer value) {
    this.attributeGroupId = value;
  }
  public Integer getAttributeGroupId() {
    return this.attributeGroupId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcAttributeGroup obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAttributeGroup fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAttributeGroup.class);
    }

  public static OcAttributeGroup fromArray(Object[] o) {
      OcAttributeGroup result = new OcAttributeGroup();
      int i = 0;
        result.setAttributeGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAttributeGroup> list) {
      JsonArray array = new JsonArray();
      for (OcAttributeGroup dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attributeGroupId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}