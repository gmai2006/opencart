
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcLengthClassDescriptionId  implements Serializable  {
  @Column(name="length_class_id")
  private Integer length_class_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcLengthClassDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLengthClassId( Integer value) {
      this.length_class_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getLengthClassId() {
      return this.length_class_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return length_class_id.hashCode()
      + language_id.hashCode();
  }

}