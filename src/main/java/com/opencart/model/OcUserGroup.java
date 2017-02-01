package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_user_group")
public class OcUserGroup  {
  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="permission" , length=65535)
  @NotNull
  private String permission;

  @Id
  @Column(name="user_group_id" , length=10)
  @NotNull
  private Integer userGroupId;

  public OcUserGroup() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setPermission( String value) {
    this.permission = value;
  }
  public String getPermission() {
    return this.permission;
  }
  public void setUserGroupId( Integer value) {
    this.userGroupId = value;
  }
  public Integer getUserGroupId() {
    return this.userGroupId;
  }

  public String toJson() {
      OcUserGroup obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcUserGroup fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcUserGroup.class);
    }

  public static OcUserGroup fromArray(Object[] o) {
      OcUserGroup result = new OcUserGroup();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setPermission((String)BeanUtils.getNullableValue(o[i++]));
        result.setUserGroupId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcUserGroup> list) {
      JsonArray array = new JsonArray();
      for (OcUserGroup dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.permission)); 
     builder.append(String.valueOf(this.userGroupId)); ;
    return builder.toString();
  }
}