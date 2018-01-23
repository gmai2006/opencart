
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
@Table(name="oc_attribute_group")
public class OcAttributeGroup  {
  @Id
  @Column(name="\"attribute_group_id\"" , length=10)
  @NotNull
  private Integer attribute_group_id;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcAttributeGroup() {
  }

  public void setAttributeGroupId( Integer value) {
    this.attribute_group_id = value;
  }
  public Integer getAttributeGroupId() {
    return this.attribute_group_id;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attribute_group_id)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}