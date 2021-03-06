
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToStoreId  implements Serializable  {
  @Column(name="store_id")
  private Integer store_id;

  @Column(name="product_id")
  private Integer product_id;

  public OcProductToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( Integer value) {
      this.store_id = value;
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public Integer getStoreId() {
      return this.store_id;
    }

    public Integer getProductId() {
      return this.product_id;
    }

  @Override
  public int hashCode() {
      return store_id.hashCode()
      + product_id.hashCode();
  }

}