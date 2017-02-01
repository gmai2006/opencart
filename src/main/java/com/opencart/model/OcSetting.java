package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_setting")
public class OcSetting  {
  @Basic
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="code" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="value" , length=65535)
  @NotNull
  private String value;

  @Id
  @Column(name="setting_id" , length=10)
  @NotNull
  private Integer settingId;

  @Basic
  @Column(name="key" , length=64)
  @NotNull
  private String key;

  @Basic
  @Column(name="serialized" )
  @NotNull
  private Boolean serialized;

  public OcSetting() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setSettingId( Integer value) {
    this.settingId = value;
  }
  public Integer getSettingId() {
    return this.settingId;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }
  public void setSerialized( Boolean value) {
    this.serialized = value;
  }
  public Boolean getSerialized() {
    return this.serialized;
  }

  public String toJson() {
      OcSetting obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcSetting fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcSetting.class);
    }

  public static OcSetting fromArray(Object[] o) {
      OcSetting result = new OcSetting();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setValue((String)BeanUtils.getNullableValue(o[i++]));
        result.setSettingId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setKey((String)BeanUtils.getNullableValue(o[i++]));
        result.setSerialized((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcSetting> list) {
      JsonArray array = new JsonArray();
      for (OcSetting dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.settingId)); 
     builder.append(String.valueOf(this.key)); 
     builder.append(String.valueOf(this.serialized)); ;
    return builder.toString();
  }
}