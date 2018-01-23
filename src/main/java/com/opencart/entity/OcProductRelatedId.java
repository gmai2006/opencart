
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductRelatedId  implements Serializable  {
  @Column(name="related_id")
  private Integer related_id;

  @Column(name="product_id")
  private Integer product_id;

  public OcProductRelatedId() {
        // Your class must have a no-arq constructor
    }

    public void setRelatedId( Integer value) {
      this.related_id = value;
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public Integer getRelatedId() {
      return this.related_id;
    }

    public Integer getProductId() {
      return this.product_id;
    }

  @Override
  public int hashCode() {
      return related_id.hashCode()
      + product_id.hashCode();
  }

}