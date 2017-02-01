package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_manufacturer_to_store")
@IdClass(value=OcManufacturerToStoreId.class)
public class OcManufacturerToStore  {
  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  @Id
  @Column(name="manufacturer_id" , length=10)
  @NotNull
  private Integer manufacturerId;

  public OcManufacturerToStore() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setManufacturerId( Integer value) {
    this.manufacturerId = value;
  }
  public Integer getManufacturerId() {
    return this.manufacturerId;
  }

  public String toJson() {
      OcManufacturerToStore obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcManufacturerToStore fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcManufacturerToStore.class);
    }

  public static OcManufacturerToStore fromArray(Object[] o) {
      OcManufacturerToStore result = new OcManufacturerToStore();
      int i = 0;
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setManufacturerId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcManufacturerToStore> list) {
      JsonArray array = new JsonArray();
      for (OcManufacturerToStore dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.manufacturerId)); ;
    return builder.toString();
  }
}