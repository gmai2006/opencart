package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_api_ip")
public class OcApiIp  {
  @Basic
  @Column(name="api_id" , length=10)
  @NotNull
  private Integer apiId;

  @Id
  @Column(name="api_ip_id" , length=10)
  @NotNull
  private Integer apiIpId;

  @Basic
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  public OcApiIp() {
  }

  public void setApiId( Integer value) {
    this.apiId = value;
  }
  public Integer getApiId() {
    return this.apiId;
  }
  public void setApiIpId( Integer value) {
    this.apiIpId = value;
  }
  public Integer getApiIpId() {
    return this.apiIpId;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }

  public String toJson() {
      OcApiIp obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcApiIp fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcApiIp.class);
    }

  public static OcApiIp fromArray(Object[] o) {
      OcApiIp result = new OcApiIp();
      int i = 0;
        result.setApiId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setApiIpId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcApiIp> list) {
      JsonArray array = new JsonArray();
      for (OcApiIp dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.apiId)); 
     builder.append(String.valueOf(this.apiIpId)); 
     builder.append(String.valueOf(this.ip)); ;
    return builder.toString();
  }
}