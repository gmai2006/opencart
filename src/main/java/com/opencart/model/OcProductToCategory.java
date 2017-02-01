package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_to_category")
@IdClass(value=OcProductToCategoryId.class)
public class OcProductToCategory  {
  @Id
  @Column(name="category_id" , length=10)
  @NotNull
  private Integer categoryId;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  public OcProductToCategory() {
  }

  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }

  public String toJson() {
      OcProductToCategory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductToCategory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductToCategory.class);
    }

  public static OcProductToCategory fromArray(Object[] o) {
      OcProductToCategory result = new OcProductToCategory();
      int i = 0;
        result.setCategoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductToCategory> list) {
      JsonArray array = new JsonArray();
      for (OcProductToCategory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.productId)); ;
    return builder.toString();
  }
}