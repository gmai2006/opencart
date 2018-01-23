
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
@Table(name="oc_filter_group")
public class OcFilterGroup  {
  @Id
  @Column(name="\"filter_group_id\"" , length=10)
  @NotNull
  private Integer filter_group_id;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcFilterGroup() {
  }

  public void setFilterGroupId( Integer value) {
    this.filter_group_id = value;
  }
  public Integer getFilterGroupId() {
    return this.filter_group_id;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.filter_group_id)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}