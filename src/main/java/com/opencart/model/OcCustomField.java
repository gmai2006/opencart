package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_custom_field")
public class OcCustomField  {
  @Id
  @Column(name="custom_field_id" , length=10)
  @NotNull
  private Integer customFieldId;

  @Basic
  @Column(name="location" , length=7)
  @NotNull
  private String location;

  @Basic
  @Column(name="type" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="value" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="sort_order" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="validation" , length=255)
  @NotNull
  private String validation;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcCustomField() {
  }

  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setValidation( String value) {
    this.validation = value;
  }
  public String getValidation() {
    return this.validation;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcCustomField obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcCustomField fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcCustomField.class);
    }

  public static OcCustomField fromArray(Object[] o) {
      OcCustomField result = new OcCustomField();
      int i = 0;
        result.setCustomFieldId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setLocation((String)BeanUtils.getNullableValue(o[i++]));
        result.setType((String)BeanUtils.getNullableValue(o[i++]));
        result.setValue((String)BeanUtils.getNullableValue(o[i++]));
        result.setSortOrder((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setValidation((String)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcCustomField> list) {
      JsonArray array = new JsonArray();
      for (OcCustomField dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.location)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.validation)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}