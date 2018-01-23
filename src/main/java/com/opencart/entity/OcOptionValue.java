
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
@Table(name="oc_option_value")
public class OcOptionValue  {
  @Id
  @Column(name="\"option_value_id\"" , length=10)
  @NotNull
  private Integer option_value_id;

  @Basic
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer option_id;

  @Basic
  @Column(name="\"image\"" , length=255)
  @NotNull
  private String image;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcOptionValue() {
  }

  public void setOptionValueId( Integer value) {
    this.option_value_id = value;
  }
  public Integer getOptionValueId() {
    return this.option_value_id;
  }
  public void setOptionId( Integer value) {
    this.option_id = value;
  }
  public Integer getOptionId() {
    return this.option_id;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.option_value_id)); 
     builder.append(String.valueOf(this.option_id)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}