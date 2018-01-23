
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldCustomerGroupId  implements Serializable  {
  @Column(name="custom_field_id")
  private Integer custom_field_id;

  @Column(name="customer_group_id")
  private Integer customer_group_id;

  public OcCustomFieldCustomerGroupId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldId( Integer value) {
      this.custom_field_id = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customer_group_id = value;
    }

    public Integer getCustomFieldId() {
      return this.custom_field_id;
    }

    public Integer getCustomerGroupId() {
      return this.customer_group_id;
    }

  @Override
  public int hashCode() {
      return custom_field_id.hashCode()
      + customer_group_id.hashCode();
  }

}