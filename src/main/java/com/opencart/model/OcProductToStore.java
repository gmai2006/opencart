package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_to_store")
@IdClass(value=OcProductToStoreId.class)
public class OcProductToStore  {
  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  public OcProductToStore() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }

  public String toJson() {
      OcProductToStore obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductToStore fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductToStore.class);
    }

  public static OcProductToStore fromArray(Object[] o) {
      OcProductToStore result = new OcProductToStore();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductToStore> list) {
      JsonArray array = new JsonArray();
      for (OcProductToStore dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.productId)); ;
    return builder.toString();
  }
}