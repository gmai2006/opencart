
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductRecurringId  implements Serializable  {
  @Column(name="recurring_id")
  private Integer recurring_id;

  @Column(name="product_id")
  private Integer product_id;

  @Column(name="customer_group_id")
  private Integer customer_group_id;

  public OcProductRecurringId() {
        // Your class must have a no-arq constructor
    }

    public void setRecurringId( Integer value) {
      this.recurring_id = value;
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customer_group_id = value;
    }

    public Integer getRecurringId() {
      return this.recurring_id;
    }

    public Integer getProductId() {
      return this.product_id;
    }

    public Integer getCustomerGroupId() {
      return this.customer_group_id;
    }

  @Override
  public int hashCode() {
      return recurring_id.hashCode()
      + product_id.hashCode()
   + customer_group_id.hashCode();
  }

}