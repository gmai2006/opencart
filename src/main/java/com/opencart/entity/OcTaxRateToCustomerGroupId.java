
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcTaxRateToCustomerGroupId  implements Serializable  {
  @Column(name="tax_rate_id")
  private Integer tax_rate_id;

  @Column(name="customer_group_id")
  private Integer customer_group_id;

  public OcTaxRateToCustomerGroupId() {
        // Your class must have a no-arq constructor
    }

    public void setTaxRateId( Integer value) {
      this.tax_rate_id = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customer_group_id = value;
    }

    public Integer getTaxRateId() {
      return this.tax_rate_id;
    }

    public Integer getCustomerGroupId() {
      return this.customer_group_id;
    }

  @Override
  public int hashCode() {
      return tax_rate_id.hashCode()
      + customer_group_id.hashCode();
  }

}