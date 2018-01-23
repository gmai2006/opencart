
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
@Table(name="oc_module")
public class OcModule  {
  @Id
  @Column(name="\"module_id\"" , length=10)
  @NotNull
  private Integer module_id;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"setting\"" , length=65535)
  @NotNull
  private String setting;

  public OcModule() {
  }

  public void setModuleId( Integer value) {
    this.module_id = value;
  }
  public Integer getModuleId() {
    return this.module_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setSetting( String value) {
    this.setting = value;
  }
  public String getSetting() {
    return this.setting;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.module_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.setting)); ;
    return builder.toString();
  }
}