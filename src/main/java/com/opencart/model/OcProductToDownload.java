package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_product_to_download")
@IdClass(value=OcProductToDownloadId.class)
public class OcProductToDownload  {
  @Id
  @Column(name="product_id" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @Column(name="download_id" , length=10)
  @NotNull
  private Integer downloadId;

  public OcProductToDownload() {
  }

  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setDownloadId( Integer value) {
    this.downloadId = value;
  }
  public Integer getDownloadId() {
    return this.downloadId;
  }

  public String toJson() {
      OcProductToDownload obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcProductToDownload fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcProductToDownload.class);
    }

  public static OcProductToDownload fromArray(Object[] o) {
      OcProductToDownload result = new OcProductToDownload();
      int i = 0;
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setDownloadId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcProductToDownload> list) {
      JsonArray array = new JsonArray();
      for (OcProductToDownload dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.downloadId)); ;
    return builder.toString();
  }
}