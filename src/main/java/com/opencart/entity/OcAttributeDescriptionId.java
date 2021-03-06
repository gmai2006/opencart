
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcAttributeDescriptionId  implements Serializable  {
  @Column(name="attribute_id")
  private Integer attribute_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcAttributeDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setAttributeId( Integer value) {
      this.attribute_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getAttributeId() {
      return this.attribute_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return attribute_id.hashCode()
      + language_id.hashCode();
  }

}