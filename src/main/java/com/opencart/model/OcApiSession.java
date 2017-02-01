package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_api_session")
public class OcApiSession  {
  @Basic
  @Column(name="api_id" , length=10)
  @NotNull
  private Integer apiId;

  @Basic
  @Column(name="session_name" , length=32)
  @NotNull
  private String sessionName;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="date_modified" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="session_id" , length=32)
  @NotNull
  private String sessionId;

  @Id
  @Column(name="api_session_id" , length=10)
  @NotNull
  private Integer apiSessionId;

  @Basic
  @Column(name="token" , length=32)
  @NotNull
  private String token;

  public OcApiSession() {
  }

  public void setApiId( Integer value) {
    this.apiId = value;
  }
  public Integer getApiId() {
    return this.apiId;
  }
  public void setSessionName( String value) {
    this.sessionName = value;
  }
  public String getSessionName() {
    return this.sessionName;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setSessionId( String value) {
    this.sessionId = value;
  }
  public String getSessionId() {
    return this.sessionId;
  }
  public void setApiSessionId( Integer value) {
    this.apiSessionId = value;
  }
  public Integer getApiSessionId() {
    return this.apiSessionId;
  }
  public void setToken( String value) {
    this.token = value;
  }
  public String getToken() {
    return this.token;
  }

  public String toJson() {
      OcApiSession obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcApiSession fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcApiSession.class);
    }

  public static OcApiSession fromArray(Object[] o) {
      OcApiSession result = new OcApiSession();
      int i = 0;
        result.setApiId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setSessionName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setDateModified((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setSessionId((String)BeanUtils.getNullableValue(o[i++]));
        result.setApiSessionId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setToken((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcApiSession> list) {
      JsonArray array = new JsonArray();
      for (OcApiSession dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.apiId)); 
     builder.append(String.valueOf(this.sessionName)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.sessionId)); 
     builder.append(String.valueOf(this.apiSessionId)); 
     builder.append(String.valueOf(this.token)); ;
    return builder.toString();
  }
}