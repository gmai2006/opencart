package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomerWishlistId  implements Serializable  {
  @Column(name="product_id")
  private OcCustomerWishlistId productId;

  @Column(name="customer_id")
  private OcCustomerWishlistId customerId;

  public OcCustomerWishlistId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( OcCustomerWishlistId value) {
      this.productId = value;
    }

    public void setCustomerId( OcCustomerWishlistId value) {
      this.customerId = value;
    }

    public OcCustomerWishlistId getProductId() {
      return this.productId;
    }

    public OcCustomerWishlistId getCustomerId() {
      return this.customerId;
    }

  @Override
  public int hashCode() {
      return productId.hashCode() 
      + customerId.hashCode();
  }

}