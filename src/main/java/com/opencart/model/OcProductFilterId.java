package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductFilterId  implements Serializable  {
  @Column(name="filter_id")
  private OcProductFilterId filterId;

  @Column(name="product_id")
  private OcProductFilterId productId;

  public OcProductFilterId() {
        // Your class must have a no-arq constructor
    }

    public void setFilterId( OcProductFilterId value) {
      this.filterId = value;
    }

    public void setProductId( OcProductFilterId value) {
      this.productId = value;
    }

    public OcProductFilterId getFilterId() {
      return this.filterId;
    }

    public OcProductFilterId getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return filterId.hashCode() 
      + productId.hashCode();
  }

}