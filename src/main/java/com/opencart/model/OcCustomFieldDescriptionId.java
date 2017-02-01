package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldDescriptionId  implements Serializable  {
  @Column(name="custom_field_id")
  private OcCustomFieldDescriptionId customFieldId;

  @Column(name="language_id")
  private OcCustomFieldDescriptionId languageId;

  public OcCustomFieldDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldId( OcCustomFieldDescriptionId value) {
      this.customFieldId = value;
    }

    public void setLanguageId( OcCustomFieldDescriptionId value) {
      this.languageId = value;
    }

    public OcCustomFieldDescriptionId getCustomFieldId() {
      return this.customFieldId;
    }

    public OcCustomFieldDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return customFieldId.hashCode() 
      + languageId.hashCode();
  }

}