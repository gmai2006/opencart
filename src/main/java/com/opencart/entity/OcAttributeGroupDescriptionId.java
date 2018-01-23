
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcAttributeGroupDescriptionId  implements Serializable  {
  @Column(name="attribute_group_id")
  private Integer attribute_group_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcAttributeGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setAttributeGroupId( Integer value) {
      this.attribute_group_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getAttributeGroupId() {
      return this.attribute_group_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return attribute_group_id.hashCode()
      + language_id.hashCode();
  }

}