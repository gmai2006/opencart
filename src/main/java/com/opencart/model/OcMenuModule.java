package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_menu_module")
public class OcMenuModule  {
  @Basic
  @Column(name="code" , length=64)
  @NotNull
  private String code;

  @Id
  @Column(name="menu_module_id" , length=10)
  @NotNull
  private Integer menuModuleId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="menu_id" , length=10)
  @NotNull
  private Integer menuId;

  public OcMenuModule() {
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setMenuModuleId( Integer value) {
    this.menuModuleId = value;
  }
  public Integer getMenuModuleId() {
    return this.menuModuleId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setMenuId( Integer value) {
    this.menuId = value;
  }
  public Integer getMenuId() {
    return this.menuId;
  }

  public String toJson() {
      OcMenuModule obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcMenuModule fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcMenuModule.class);
    }

  public static OcMenuModule fromArray(Object[] o) {
      OcMenuModule result = new OcMenuModule();
      int i = 0;
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setMenuModuleId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setMenuId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcMenuModule> list) {
      JsonArray array = new JsonArray();
      for (OcMenuModule dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.menuModuleId)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.menuId)); ;
    return builder.toString();
  }
}