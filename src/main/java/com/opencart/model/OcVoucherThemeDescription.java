package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_voucher_theme_description")
@IdClass(value=OcVoucherThemeDescriptionId.class)
public class OcVoucherThemeDescription  {
  @Id
  @Column(name="voucher_theme_id" , length=10)
  @NotNull
  private Integer voucherThemeId;

  @Basic
  @Column(name="name" , length=32)
  @NotNull
  private String name;

  @Id
  @Column(name="language_id" , length=10)
  @NotNull
  private Integer languageId;

  public OcVoucherThemeDescription() {
  }

  public void setVoucherThemeId( Integer value) {
    this.voucherThemeId = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucherThemeId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toJson() {
      OcVoucherThemeDescription obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcVoucherThemeDescription fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcVoucherThemeDescription.class);
    }

  public static OcVoucherThemeDescription fromArray(Object[] o) {
      OcVoucherThemeDescription result = new OcVoucherThemeDescription();
      int i = 0;
        result.setVoucherThemeId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setLanguageId((Integer)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcVoucherThemeDescription> list) {
      JsonArray array = new JsonArray();
      for (OcVoucherThemeDescription dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.voucherThemeId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}