package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_return_reason")
@IdClass(value=OcReturnReasonId.class)
public class OcReturnReason  {
  @Id
  @Column(name="return_reason_id" , length=10)
  @NotNull
  private Integer returnReasonId;

  @Basic
  @Column(name="name" , length=128)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcReturnReason() {
  }

  public void setReturnReasonId( Integer value) {
    this.returnReasonId = value;
  }
  public Integer getReturnReasonId() {
    return this.returnReasonId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcReturnReason obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcReturnReason fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcReturnReason.class);
    }

  public static OcReturnReason fromArray(Object[] o) {
      OcReturnReason result = new OcReturnReason();
      int i = 0;
        result.setReturnReasonId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcReturnReason> list) {
      JsonArray array = new JsonArray();
      for (OcReturnReason dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.returnReasonId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}