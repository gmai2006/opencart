
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
@Table(name="oc_api_ip")
public class OcApiIp  {
  @Id
  @Column(name="\"api_ip_id\"" , length=10)
  @NotNull
  private Integer api_ip_id;

  @Basic
  @Column(name="\"api_id\"" , length=10)
  @NotNull
  private Integer api_id;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  public OcApiIp() {
  }

  public void setApiIpId( Integer value) {
    this.api_ip_id = value;
  }
  public Integer getApiIpId() {
    return this.api_ip_id;
  }
  public void setApiId( Integer value) {
    this.api_id = value;
  }
  public Integer getApiId() {
    return this.api_id;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.api_ip_id)); 
     builder.append(String.valueOf(this.api_id)); 
     builder.append(String.valueOf(this.ip)); ;
    return builder.toString();
  }
}