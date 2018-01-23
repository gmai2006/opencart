
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductFilterId  implements Serializable  {
  @Column(name="filter_id")
  private Integer filter_id;

  @Column(name="product_id")
  private Integer product_id;

  public OcProductFilterId() {
        // Your class must have a no-arq constructor
    }

    public void setFilterId( Integer value) {
      this.filter_id = value;
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public Integer getFilterId() {
      return this.filter_id;
    }

    public Integer getProductId() {
      return this.product_id;
    }

  @Override
  public int hashCode() {
      return filter_id.hashCode()
      + product_id.hashCode();
  }

}