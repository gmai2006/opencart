
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
@Table(name="oc_extension")
public class OcExtension  {
  @Id
  @Column(name="\"extension_id\"" , length=10)
  @NotNull
  private Integer extension_id;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  public OcExtension() {
  }

  public void setExtensionId( Integer value) {
    this.extension_id = value;
  }
  public Integer getExtensionId() {
    return this.extension_id;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.extension_id)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.code)); ;
    return builder.toString();
  }
}