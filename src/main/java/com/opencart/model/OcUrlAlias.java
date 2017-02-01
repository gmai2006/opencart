package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_url_alias")
public class OcUrlAlias  {
  @Basic
  @Column(name="query" , length=255)
  @NotNull
  private String query;

  @Basic
  @Column(name="keyword" , length=255)
  @NotNull
  private String keyword;

  @Id
  @Column(name="url_alias_id" , length=10)
  @NotNull
  private Integer urlAliasId;

  public OcUrlAlias() {
  }

  public void setQuery( String value) {
    this.query = value;
  }
  public String getQuery() {
    return this.query;
  }
  public void setKeyword( String value) {
    this.keyword = value;
  }
  public String getKeyword() {
    return this.keyword;
  }
  public void setUrlAliasId( Integer value) {
    this.urlAliasId = value;
  }
  public Integer getUrlAliasId() {
    return this.urlAliasId;
  }

  public String toJson() {
      OcUrlAlias obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcUrlAlias fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcUrlAlias.class);
    }

  public static OcUrlAlias fromArray(Object[] o) {
      OcUrlAlias result = new OcUrlAlias();
      int i = 0;
        result.setQuery((String)BeanUtils.getNullableValue(o[i++]));
        result.setKeyword((String)BeanUtils.getNullableValue(o[i++]));
        result.setUrlAliasId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcUrlAlias> list) {
      JsonArray array = new JsonArray();
      for (OcUrlAlias dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.query)); 
     builder.append(String.valueOf(this.keyword)); 
     builder.append(String.valueOf(this.urlAliasId)); ;
    return builder.toString();
  }
}