package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToLayoutId  implements Serializable  {
  @Column(name="store_id")
  private OcProductToLayoutId storeId;

  @Column(name="product_id")
  private OcProductToLayoutId productId;

  public OcProductToLayoutId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( OcProductToLayoutId value) {
      this.storeId = value;
    }

    public void setProductId( OcProductToLayoutId value) {
      this.productId = value;
    }

    public OcProductToLayoutId getStoreId() {
      return this.storeId;
    }

    public OcProductToLayoutId getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + productId.hashCode();
  }

}