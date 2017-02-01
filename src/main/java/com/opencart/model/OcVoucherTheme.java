package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_voucher_theme")
public class OcVoucherTheme  {
  @Basic
  @Column(name="image" , length=255)
  @NotNull
  private String image;

  @Id
  @Column(name="voucher_theme_id" , length=10)
  @NotNull
  private Integer voucherThemeId;

  public OcVoucherTheme() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setVoucherThemeId( Integer value) {
    this.voucherThemeId = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucherThemeId;
  }

  public String toJson() {
      OcVoucherTheme obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcVoucherTheme fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcVoucherTheme.class);
    }

  public static OcVoucherTheme fromArray(Object[] o) {
      OcVoucherTheme result = new OcVoucherTheme();
      int i = 0;
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setVoucherThemeId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcVoucherTheme> list) {
      JsonArray array = new JsonArray();
      for (OcVoucherTheme dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.voucherThemeId)); ;
    return builder.toString();
  }
}