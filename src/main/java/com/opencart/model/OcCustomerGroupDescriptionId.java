package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomerGroupDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private OcCustomerGroupDescriptionId languageId;

  @Column(name="customer_group_id")
  private OcCustomerGroupDescriptionId customerGroupId;

  public OcCustomerGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( OcCustomerGroupDescriptionId value) {
      this.languageId = value;
    }

    public void setCustomerGroupId( OcCustomerGroupDescriptionId value) {
      this.customerGroupId = value;
    }

    public OcCustomerGroupDescriptionId getLanguageId() {
      return this.languageId;
    }

    public OcCustomerGroupDescriptionId getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + customerGroupId.hashCode();
  }

}