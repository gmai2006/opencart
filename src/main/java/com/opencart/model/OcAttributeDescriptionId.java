package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcAttributeDescriptionId  implements Serializable  {
  @Column(name="attribute_id")
  private OcAttributeDescriptionId attributeId;

  @Column(name="language_id")
  private OcAttributeDescriptionId languageId;

  public OcAttributeDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setAttributeId( OcAttributeDescriptionId value) {
      this.attributeId = value;
    }

    public void setLanguageId( OcAttributeDescriptionId value) {
      this.languageId = value;
    }

    public OcAttributeDescriptionId getAttributeId() {
      return this.attributeId;
    }

    public OcAttributeDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return attributeId.hashCode() 
      + languageId.hashCode();
  }

}