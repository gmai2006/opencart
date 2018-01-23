
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcWeightClassDescriptionId  implements Serializable  {
  @Column(name="weight_class_id")
  private Integer weight_class_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcWeightClassDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setWeightClassId( Integer value) {
      this.weight_class_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getWeightClassId() {
      return this.weight_class_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return weight_class_id.hashCode()
      + language_id.hashCode();
  }

}