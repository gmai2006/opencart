package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_menu")
public class OcMenu  {
  @Basic
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="link" , length=255)
  @NotNull
  private String link;

  @Basic
  @Column(name="type" , length=6)
  @NotNull
  private String type;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Id
  @Column(name="menu_id" , length=10)
  @NotNull
  private Integer menuId;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcMenu() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
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
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcMenu obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcMenu fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcMenu.class);
    }

  public static OcMenu fromArray(Object[] o) {
      OcMenu result = new OcMenu();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLink((String)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setMenuId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcMenu> list) {
      JsonArray array = new JsonArray();
      for (OcMenu dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.link)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.menuId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}