
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductDescriptionId  implements Serializable  {
  @Column(name="product_id")
  private Integer product_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcProductDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getProductId() {
      return this.product_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return product_id.hashCode()
      + language_id.hashCode();
  }

}