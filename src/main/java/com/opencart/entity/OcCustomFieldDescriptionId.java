
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldDescriptionId  implements Serializable  {
  @Column(name="custom_field_id")
  private Integer custom_field_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcCustomFieldDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldId( Integer value) {
      this.custom_field_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getCustomFieldId() {
      return this.custom_field_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return custom_field_id.hashCode()
      + language_id.hashCode();
  }

}