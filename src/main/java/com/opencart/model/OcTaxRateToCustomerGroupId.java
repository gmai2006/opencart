package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcTaxRateToCustomerGroupId  implements Serializable  {
  @Column(name="tax_rate_id")
  private OcTaxRateToCustomerGroupId taxRateId;

  @Column(name="customer_group_id")
  private OcTaxRateToCustomerGroupId customerGroupId;

  public OcTaxRateToCustomerGroupId() {
        // Your class must have a no-arq constructor
    }

    public void setTaxRateId( OcTaxRateToCustomerGroupId value) {
      this.taxRateId = value;
    }

    public void setCustomerGroupId( OcTaxRateToCustomerGroupId value) {
      this.customerGroupId = value;
    }

    public OcTaxRateToCustomerGroupId getTaxRateId() {
      return this.taxRateId;
    }

    public OcTaxRateToCustomerGroupId getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return taxRateId.hashCode() 
      + customerGroupId.hashCode();
  }

}