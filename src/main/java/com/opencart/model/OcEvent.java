package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_event")
public class OcEvent  {
  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="event_id" , length=10)
  @NotNull
  private Integer eventId;

  @Basic
  @Column(name="code" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="action" , length=65535)
  @NotNull
  private String action;

  @Basic
  @Column(name="trigger" , length=65535)
  @NotNull
  private String trigger;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcEvent() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setEventId( Integer value) {
    this.eventId = value;
  }
  public Integer getEventId() {
    return this.eventId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setTrigger( String value) {
    this.trigger = value;
  }
  public String getTrigger() {
    return this.trigger;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcEvent obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcEvent fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcEvent.class);
    }

  public static OcEvent fromArray(Object[] o) {
      OcEvent result = new OcEvent();
      int i = 0;
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setEventId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setAction((String)BeanUtils.getNullableValue(o[i++]));
        result.setTrigger((String)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcEvent> list) {
      JsonArray array = new JsonArray();
      for (OcEvent dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.eventId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.action)); 
     builder.append(String.valueOf(this.trigger)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}