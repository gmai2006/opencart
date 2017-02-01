package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_return_history")
public class OcReturnHistory  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="return_history_id" , length=10)
  @NotNull
  private Integer returnHistoryId;

  @Basic
  @Column(name="return_id" , length=10)
  @NotNull
  private Integer returnId;

  @Basic
  @Column(name="return_status_id" , length=10)
  @NotNull
  private Integer returnStatusId;

  @Basic
  @Column(name="comment" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="notify" )
  @NotNull
  private Boolean notify;

  public OcReturnHistory() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setReturnHistoryId( Integer value) {
    this.returnHistoryId = value;
  }
  public Integer getReturnHistoryId() {
    return this.returnHistoryId;
  }
  public void setReturnId( Integer value) {
    this.returnId = value;
  }
  public Integer getReturnId() {
    return this.returnId;
  }
  public void setReturnStatusId( Integer value) {
    this.returnStatusId = value;
  }
  public Integer getReturnStatusId() {
    return this.returnStatusId;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setNotify( Boolean value) {
    this.notify = value;
  }
  public Boolean getNotify() {
    return this.notify;
  }

  public String toJson() {
      OcReturnHistory obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcReturnHistory fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcReturnHistory.class);
    }

  public static OcReturnHistory fromArray(Object[] o) {
      OcReturnHistory result = new OcReturnHistory();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setReturnHistoryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setReturnId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setReturnStatusId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setComment((String)BeanUtils.getNullableValue(o[i++]));
        result.setNotify((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcReturnHistory> list) {
      JsonArray array = new JsonArray();
      for (OcReturnHistory dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.returnHistoryId)); 
     builder.append(String.valueOf(this.returnId)); 
     builder.append(String.valueOf(this.returnStatusId)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.notify)); ;
    return builder.toString();
  }
}