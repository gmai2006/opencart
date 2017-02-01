package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_return_action")
@IdClass(value=OcReturnActionId.class)
public class OcReturnAction  {
  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  @Id
  @Column(name="return_action_id" , length=10)
  @NotNull
  private Integer returnActionId;

  public OcReturnAction() {
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
  public void setReturnActionId( Integer value) {
    this.returnActionId = value;
  }
  public Integer getReturnActionId() {
    return this.returnActionId;
  }

  public String toJson() {
      OcReturnAction obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcReturnAction fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcReturnAction.class);
    }

  public static OcReturnAction fromArray(Object[] o) {
      OcReturnAction result = new OcReturnAction();
      int i = 0;
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setReturnActionId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcReturnAction> list) {
      JsonArray array = new JsonArray();
      for (OcReturnAction dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.returnActionId)); ;
    return builder.toString();
  }
}