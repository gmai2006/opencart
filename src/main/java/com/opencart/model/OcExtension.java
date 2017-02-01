package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_extension")
public class OcExtension  {
  @Id
  @Column(name="extension_id" , length=10)
  @NotNull
  private Integer extensionId;

  @Basic
  @Column(name="code" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="type" , length=32)
  @NotNull
  private String type;

  public OcExtension() {
  }

  public void setExtensionId( Integer value) {
    this.extensionId = value;
  }
  public Integer getExtensionId() {
    return this.extensionId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }

  public String toJson() {
      OcExtension obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcExtension fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcExtension.class);
    }

  public static OcExtension fromArray(Object[] o) {
      OcExtension result = new OcExtension();
      int i = 0;
        result.setExtensionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcExtension> list) {
      JsonArray array = new JsonArray();
      for (OcExtension dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.extensionId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.type)); ;
    return builder.toString();
  }
}