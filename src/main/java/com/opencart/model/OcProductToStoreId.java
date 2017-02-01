package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToStoreId  implements Serializable  {
  @Column(name="store_id")
  private OcProductToStoreId storeId;

  @Column(name="product_id")
  private OcProductToStoreId productId;

  public OcProductToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( OcProductToStoreId value) {
      this.storeId = value;
    }

    public void setProductId( OcProductToStoreId value) {
      this.productId = value;
    }

    public OcProductToStoreId getStoreId() {
      return this.storeId;
    }

    public OcProductToStoreId getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + productId.hashCode();
  }

}