package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductRecurringId  implements Serializable  {
  @Column(name="recurring_id")
  private OcProductRecurringId recurringId;

  @Column(name="product_id")
  private OcProductRecurringId productId;

  @Column(name="customer_group_id")
  private OcProductRecurringId customerGroupId;

  public OcProductRecurringId() {
        // Your class must have a no-arq constructor
    }

    public void setRecurringId( OcProductRecurringId value) {
      this.recurringId = value;
    }

    public void setProductId( OcProductRecurringId value) {
      this.productId = value;
    }

    public void setCustomerGroupId( OcProductRecurringId value) {
      this.customerGroupId = value;
    }

    public OcProductRecurringId getRecurringId() {
      return this.recurringId;
    }

    public OcProductRecurringId getProductId() {
      return this.productId;
    }

    public OcProductRecurringId getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return recurringId.hashCode() 
      + productId.hashCode()
   + customerGroupId.hashCode();
  }

}