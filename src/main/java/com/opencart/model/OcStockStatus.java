package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_stock_status")
@IdClass(value=OcStockStatusId.class)
public class OcStockStatus  {
  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Id
  @Column(name="stock_status_id" , length=10)
  @NotNull
  private Integer stockStatusId;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcStockStatus() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setStockStatusId( Integer value) {
    this.stockStatusId = value;
  }
  public Integer getStockStatusId() {
    return this.stockStatusId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcStockStatus obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcStockStatus fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcStockStatus.class);
    }

  public static OcStockStatus fromArray(Object[] o) {
      OcStockStatus result = new OcStockStatus();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setStockStatusId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcStockStatus> list) {
      JsonArray array = new JsonArray();
      for (OcStockStatus dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.stockStatusId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}