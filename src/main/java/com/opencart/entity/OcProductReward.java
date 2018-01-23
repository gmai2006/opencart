
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
@Table(name="oc_product_reward")
public class OcProductReward  {
  @Id
  @Column(name="\"product_reward_id\"" , length=10)
  @NotNull
  private Integer product_reward_id;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer product_id;

  @Basic
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customer_group_id;

  @Basic
  @Column(name="\"points\"" , length=10)
  @NotNull
  private Integer points;

  public OcProductReward() {
  }

  public void setProductRewardId( Integer value) {
    this.product_reward_id = value;
  }
  public Integer getProductRewardId() {
    return this.product_reward_id;
  }
  public void setProductId( Integer value) {
    this.product_id = value;
  }
  public Integer getProductId() {
    return this.product_id;
  }
  public void setCustomerGroupId( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getCustomerGroupId() {
    return this.customer_group_id;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.product_reward_id)); 
     builder.append(String.valueOf(this.product_id)); 
     builder.append(String.valueOf(this.customer_group_id)); 
     builder.append(String.valueOf(this.points)); ;
    return builder.toString();
  }
}