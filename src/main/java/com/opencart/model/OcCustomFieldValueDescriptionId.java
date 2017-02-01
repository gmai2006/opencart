package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldValueDescriptionId  implements Serializable  {
  @Column(name="custom_field_value_id")
  private OcCustomFieldValueDescriptionId customFieldValueId;

  @Column(name="language_id")
  private OcCustomFieldValueDescriptionId languageId;

  public OcCustomFieldValueDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldValueId( OcCustomFieldValueDescriptionId value) {
      this.customFieldValueId = value;
    }

    public void setLanguageId( OcCustomFieldValueDescriptionId value) {
      this.languageId = value;
    }

    public OcCustomFieldValueDescriptionId getCustomFieldValueId() {
      return this.customFieldValueId;
    }

    public OcCustomFieldValueDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return customFieldValueId.hashCode() 
      + languageId.hashCode();
  }

}