package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_filter")
@IdClass(value=OcProductFilterId.class)
public class OcProductFilter  {
  @Id
  @Column(name="filter_id" , length=10)
  @NotNull
  private Integer filterId;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  public OcProductFilter() {
  }

  public void setFilterId( Integer value) {
    this.filterId = value;
  }
  public Integer getFilterId() {
    return this.filterId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }

  public String toJson() {
      OcProductFilter obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductFilter fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductFilter.class);
    }

  public static OcProductFilter fromArray(Object[] o) {
      OcProductFilter result = new OcProductFilter();
      int i = 0;
        result.setFilterId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductFilter> list) {
      JsonArray array = new JsonArray();
      for (OcProductFilter dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.filterId)); 
     builder.append(String.valueOf(this.productId)); ;
    return builder.toString();
  }
}