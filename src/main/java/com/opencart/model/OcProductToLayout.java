package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_to_layout")
@IdClass(value=OcProductToLayoutId.class)
public class OcProductToLayout  {
  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="layout_id" , length=10)
  @NotNull
  private Integer layoutId;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  public OcProductToLayout() {
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
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }

  public String toJson() {
      OcProductToLayout obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductToLayout fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductToLayout.class);
    }

  public static OcProductToLayout fromArray(Object[] o) {
      OcProductToLayout result = new OcProductToLayout();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLayoutId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductToLayout> list) {
      JsonArray array = new JsonArray();
      for (OcProductToLayout dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.productId)); ;
    return builder.toString();
  }
}