package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_information_to_store")
@IdClass(value=OcInformationToStoreId.class)
public class OcInformationToStore  {
  @Id
  @Column(name="information_id" , length=10)
  @NotNull
  private Integer informationId;

  @Id
  @Column(name="store_id" , length=10)
  @NotNull
  private Integer storeId;

  public OcInformationToStore() {
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

  public String toJson() {
      OcInformationToStore obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcInformationToStore fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcInformationToStore.class);
    }

  public static OcInformationToStore fromArray(Object[] o) {
      OcInformationToStore result = new OcInformationToStore();
      int i = 0;
        result.setInformationId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStoreId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcInformationToStore> list) {
      JsonArray array = new JsonArray();
      for (OcInformationToStore dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.informationId)); 
     builder.append(String.valueOf(this.storeId)); ;
    return builder.toString();
  }
}