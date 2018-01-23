
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldValueDescriptionId  implements Serializable  {
  @Column(name="custom_field_value_id")
  private Integer custom_field_value_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcCustomFieldValueDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldValueId( Integer value) {
      this.custom_field_value_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getCustomFieldValueId() {
      return this.custom_field_value_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return custom_field_value_id.hashCode()
      + language_id.hashCode();
  }

}