
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
@Table(name="oc_user_group")
public class OcUserGroup  {
  @Id
  @Column(name="\"user_group_id\"" , length=10)
  @NotNull
  private Integer user_group_id;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"permission\"" , length=65535)
  @NotNull
  private String permission;

  public OcUserGroup() {
  }

  public void setUserGroupId( Integer value) {
    this.user_group_id = value;
  }
  public Integer getUserGroupId() {
    return this.user_group_id;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setPermission( String value) {
    this.permission = value;
  }
  public String getPermission() {
    return this.permission;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.user_group_id)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.permission)); ;
    return builder.toString();
  }
}