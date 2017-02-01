package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_layout_module")
public class OcLayoutModule  {
  @Basic
  @Column(name="layout_id" , length=10)
  @NotNull
  private Integer layoutId;

  @Basic
  @Column(name="code" , length=64)
  @NotNull
  private String code;

  @Id
  @Column(name="layout_module_id" , length=10)
  @NotNull
  private Integer layoutModuleId;

  @Basic
  @Column(name="position" , length=14)
  @NotNull
  private String position;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcLayoutModule() {
  }

  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setLayoutModuleId( Integer value) {
    this.layoutModuleId = value;
  }
  public Integer getLayoutModuleId() {
    return this.layoutModuleId;
  }
  public void setPosition( String value) {
    this.position = value;
  }
  public String getPosition() {
    return this.position;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcLayoutModule obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcLayoutModule fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcLayoutModule.class);
    }

  public static OcLayoutModule fromArray(Object[] o) {
      OcLayoutModule result = new OcLayoutModule();
      int i = 0;
        result.setLayoutId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setLayoutModuleId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPosition((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcLayoutModule> list) {
      JsonArray array = new JsonArray();
      for (OcLayoutModule dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.layoutModuleId)); 
     builder.append(String.valueOf(this.position)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}