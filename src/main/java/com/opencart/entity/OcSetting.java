
package com.opencart.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_setting")
public class OcSetting  {
  @Id
  @Column(name="\"setting_id\"" , length=10)
  @NotNull
  private Integer setting_id;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"key\"" , length=64)
  @NotNull
  private String key;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="\"serialized\"" )
  @NotNull
  private Boolean serialized;

  public OcSetting() {
  }

  public void setSettingId( Integer value) {
    this.setting_id = value;
  }
  public Integer getSettingId() {
    return this.setting_id;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setSerialized( Boolean value) {
    this.serialized = value;
  }
  public Boolean getSerialized() {
    return this.serialized;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.setting_id)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.key)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.serialized)); ;
    return builder.toString();
  }
}