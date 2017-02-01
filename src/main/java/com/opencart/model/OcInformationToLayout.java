package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_information_to_layout")
@IdClass(value=OcInformationToLayoutId.class)
public class OcInformationToLayout  {
  @Id
  @Column(name="information_id" , length=10)
  @NotNull
  private Integer informationId;

  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="layout_id" , length=10)
  @NotNull
  private Integer layoutId;

  public OcInformationToLayout() {
  }

  public void setInformationId( Integer value) {
    this.informationId = value;
  }
  public Integer getInformationId() {
    return this.informationId;
  }
  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }

  public String toJson() {
      OcInformationToLayout obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcInformationToLayout fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcInformationToLayout.class);
    }

  public static OcInformationToLayout fromArray(Object[] o) {
      OcInformationToLayout result = new OcInformationToLayout();
      int i = 0;
        result.setInformationId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLayoutId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcInformationToLayout> list) {
      JsonArray array = new JsonArray();
      for (OcInformationToLayout dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.informationId)); 
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.layoutId)); ;
    return builder.toString();
  }
}