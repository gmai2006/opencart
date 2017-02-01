package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToCategoryId  implements Serializable  {
  @Column(name="category_id")
  private OcProductToCategoryId categoryId;

  @Column(name="product_id")
  private OcProductToCategoryId productId;

  public OcProductToCategoryId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( OcProductToCategoryId value) {
      this.categoryId = value;
    }

    public void setProductId( OcProductToCategoryId value) {
      this.productId = value;
    }

    public OcProductToCategoryId getCategoryId() {
      return this.categoryId;
    }

    public OcProductToCategoryId getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + productId.hashCode();
  }

}