package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldCustomerGroupId  implements Serializable  {
  @Column(name="custom_field_id")
  private OcCustomFieldCustomerGroupId customFieldId;

  @Column(name="customer_group_id")
  private OcCustomFieldCustomerGroupId customerGroupId;

  public OcCustomFieldCustomerGroupId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldId( OcCustomFieldCustomerGroupId value) {
      this.customFieldId = value;
    }

    public void setCustomerGroupId( OcCustomFieldCustomerGroupId value) {
      this.customerGroupId = value;
    }

    public OcCustomFieldCustomerGroupId getCustomFieldId() {
      return this.customFieldId;
    }

    public OcCustomFieldCustomerGroupId getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return customFieldId.hashCode() 
      + customerGroupId.hashCode();
  }

}