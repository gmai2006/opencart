package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductRelatedId  implements Serializable  {
  @Column(name="related_id")
  private OcProductRelatedId relatedId;

  @Column(name="product_id")
  private OcProductRelatedId productId;

  public OcProductRelatedId() {
        // Your class must have a no-arq constructor
    }

    public void setRelatedId( OcProductRelatedId value) {
      this.relatedId = value;
    }

    public void setProductId( OcProductRelatedId value) {
      this.productId = value;
    }

    public OcProductRelatedId getRelatedId() {
      return this.relatedId;
    }

    public OcProductRelatedId getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return relatedId.hashCode() 
      + productId.hashCode();
  }

}