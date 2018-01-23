
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToCategoryId  implements Serializable  {
  @Column(name="category_id")
  private Integer category_id;

  @Column(name="product_id")
  private Integer product_id;

  public OcProductToCategoryId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.category_id = value;
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public Integer getCategoryId() {
      return this.category_id;
    }

    public Integer getProductId() {
      return this.product_id;
    }

  @Override
  public int hashCode() {
      return category_id.hashCode()
      + product_id.hashCode();
  }

}