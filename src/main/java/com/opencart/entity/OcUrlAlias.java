
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
@Table(name="oc_url_alias")
public class OcUrlAlias  {
  @Id
  @Column(name="\"url_alias_id\"" , length=10)
  @NotNull
  private Integer url_alias_id;

  @Basic
  @Column(name="\"query\"" , length=255)
  @NotNull
  private String query;

  @Basic
  @Column(name="\"keyword\"" , length=255)
  @NotNull
  private String keyword;

  public OcUrlAlias() {
  }

  public void setUrlAliasId( Integer value) {
    this.url_alias_id = value;
  }
  public Integer getUrlAliasId() {
    return this.url_alias_id;
  }
  public void setQuery( String value) {
    this.query = value;
  }
  public String getQuery() {
    return this.query;
  }
  public void setKeyword( String value) {
    this.keyword = value;
  }
  public String getKeyword() {
    return this.keyword;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.url_alias_id)); 
     builder.append(String.valueOf(this.query)); 
     builder.append(String.valueOf(this.keyword)); ;
    return builder.toString();
  }
}