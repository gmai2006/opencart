
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomerGroupDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer language_id;

  @Column(name="customer_group_id")
  private Integer customer_group_id;

  public OcCustomerGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customer_group_id = value;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

    public Integer getCustomerGroupId() {
      return this.customer_group_id;
    }

  @Override
  public int hashCode() {
      return language_id.hashCode()
      + customer_group_id.hashCode();
  }

}