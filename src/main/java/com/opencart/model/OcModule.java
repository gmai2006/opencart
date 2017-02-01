package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_module")
public class OcModule  {
  @Id
  @Column(name="module_id" , length=10)
  @NotNull
  private Integer moduleId;

  @Basic
  @Column(name="code" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="setting" , length=65535)
  @NotNull
  private String setting;

  public OcModule() {
  }

  public void setModuleId( Integer value) {
    this.moduleId = value;
  }
  public Integer getModuleId() {
    return this.moduleId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setSetting( String value) {
    this.setting = value;
  }
  public String getSetting() {
    return this.setting;
  }

  public String toJson() {
      OcModule obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcModule fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcModule.class);
    }

  public static OcModule fromArray(Object[] o) {
      OcModule result = new OcModule();
      int i = 0;
        result.setModuleId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setSetting((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcModule> list) {
      JsonArray array = new JsonArray();
      for (OcModule dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.moduleId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.setting)); ;
    return builder.toString();
  }
}