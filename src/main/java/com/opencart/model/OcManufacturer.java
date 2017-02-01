package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_manufacturer")
public class OcManufacturer  {
  @Basic
  @Column(name="image" , length=255)
  private String image;

  @Id
  @Column(name="manufacturer_id" , length=10)
  @NotNull
  private Integer manufacturerId;

  @Basic
  @Column(name="name" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcManufacturer() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setManufacturerId( Integer value) {
    this.manufacturerId = value;
  }
  public Integer getManufacturerId() {
    return this.manufacturerId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcManufacturer obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcManufacturer fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcManufacturer.class);
    }

  public static OcManufacturer fromArray(Object[] o) {
      OcManufacturer result = new OcManufacturer();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setManufacturerId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcManufacturer> list) {
      JsonArray array = new JsonArray();
      for (OcManufacturer dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.manufacturerId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}