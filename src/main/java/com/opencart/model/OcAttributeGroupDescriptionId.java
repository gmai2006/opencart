package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcAttributeGroupDescriptionId  implements Serializable  {
  @Column(name="attribute_group_id")
  private OcAttributeGroupDescriptionId attributeGroupId;

  @Column(name="language_id")
  private OcAttributeGroupDescriptionId languageId;

  public OcAttributeGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setAttributeGroupId( OcAttributeGroupDescriptionId value) {
      this.attributeGroupId = value;
    }

    public void setLanguageId( OcAttributeGroupDescriptionId value) {
      this.languageId = value;
    }

    public OcAttributeGroupDescriptionId getAttributeGroupId() {
      return this.attributeGroupId;
    }

    public OcAttributeGroupDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return attributeGroupId.hashCode() 
      + languageId.hashCode();
  }

}