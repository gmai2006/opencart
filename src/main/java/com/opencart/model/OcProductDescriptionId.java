package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductDescriptionId  implements Serializable  {
  @Column(name="product_id")
  private OcProductDescriptionId productId;

  @Column(name="language_id")
  private OcProductDescriptionId languageId;

  public OcProductDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( OcProductDescriptionId value) {
      this.productId = value;
    }

    public void setLanguageId( OcProductDescriptionId value) {
      this.languageId = value;
    }

    public OcProductDescriptionId getProductId() {
      return this.productId;
    }

    public OcProductDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return productId.hashCode() 
      + languageId.hashCode();
  }

}