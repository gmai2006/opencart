
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomerWishlistId  implements Serializable  {
  @Column(name="product_id")
  private Integer product_id;

  @Column(name="customer_id")
  private Integer customer_id;

  public OcCustomerWishlistId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public void setCustomerId( Integer value) {
      this.customer_id = value;
    }

    public Integer getProductId() {
      return this.product_id;
    }

    public Integer getCustomerId() {
      return this.customer_id;
    }

  @Override
  public int hashCode() {
      return product_id.hashCode()
      + customer_id.hashCode();
  }

}