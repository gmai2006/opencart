package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductAttributeId  implements Serializable  {
  @Column(name="attribute_id")
  private OcProductAttributeId attributeId;

  @Column(name="product_id")
  private OcProductAttributeId productId;

  @Column(name="language_id")
  private OcProductAttributeId languageId;

  public OcProductAttributeId() {
        // Your class must have a no-arq constructor
    }

    public void setAttributeId( OcProductAttributeId value) {
      this.attributeId = value;
    }

    public void setProductId( OcProductAttributeId value) {
      this.productId = value;
    }

    public void setLanguageId( OcProductAttributeId value) {
      this.languageId = value;
    }

    public OcProductAttributeId getAttributeId() {
      return this.attributeId;
    }

    public OcProductAttributeId getProductId() {
      return this.productId;
    }

    public OcProductAttributeId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return attributeId.hashCode() 
      + productId.hashCode()
   + languageId.hashCode();
  }

}