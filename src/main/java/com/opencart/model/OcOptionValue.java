package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_option_value")
public class OcOptionValue  {
  @Basic
  @Column(name="image" , length=255)
  @NotNull
  private String image;

  @Id
  @Column(name="option_value_id" , length=10)
  @NotNull
  private Integer optionValueId;

  @Basic
  @Column(name="option_id" , length=10)
  @NotNull
  private Integer optionId;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcOptionValue() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setOptionValueId( Integer value) {
    this.optionValueId = value;
  }
  public Integer getOptionValueId() {
    return this.optionValueId;
  }
  public void setOptionId( Integer value) {
    this.optionId = value;
  }
  public Integer getOptionId() {
    return this.optionId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toJson() {
      OcOptionValue obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcOptionValue fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcOptionValue.class);
    }

  public static OcOptionValue fromArray(Object[] o) {
      OcOptionValue result = new OcOptionValue();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setOptionValueId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setOptionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcOptionValue> list) {
      JsonArray array = new JsonArray();
      for (OcOptionValue dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.optionValueId)); 
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}