package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_related")
@IdClass(value=OcProductRelatedId.class)
public class OcProductRelated  {
  @Id
  @Column(name="related_id" , length=10)
  @NotNull
  private Integer relatedId;

  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  public OcProductRelated() {
  }

  public void setRelatedId( Integer value) {
    this.relatedId = value;
  }
  public Integer getRelatedId() {
    return this.relatedId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }

  public String toJson() {
      OcProductRelated obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductRelated fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductRelated.class);
    }

  public static OcProductRelated fromArray(Object[] o) {
      OcProductRelated result = new OcProductRelated();
      int i = 0;
        result.setRelatedId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductRelated> list) {
      JsonArray array = new JsonArray();
      for (OcProductRelated dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.relatedId)); 
     builder.append(String.valueOf(this.productId)); ;
    return builder.toString();
  }
}