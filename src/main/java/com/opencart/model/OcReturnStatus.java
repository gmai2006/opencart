package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_return_status")
@IdClass(value=OcReturnStatusId.class)
public class OcReturnStatus  {
  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Id
  @Column(name="return_status_id" , length=10)
  @NotNull
  private Integer returnStatusId;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcReturnStatus() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setReturnStatusId( Integer value) {
    this.returnStatusId = value;
  }
  public Integer getReturnStatusId() {
    return this.returnStatusId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcReturnStatus obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcReturnStatus fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcReturnStatus.class);
    }

  public static OcReturnStatus fromArray(Object[] o) {
      OcReturnStatus result = new OcReturnStatus();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setReturnStatusId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcReturnStatus> list) {
      JsonArray array = new JsonArray();
      for (OcReturnStatus dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.returnStatusId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}