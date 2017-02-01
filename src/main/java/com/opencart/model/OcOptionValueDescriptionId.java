package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOptionValueDescriptionId  implements Serializable  {
  @Column(name="option_value_id")
  private OcOptionValueDescriptionId optionValueId;

  @Column(name="language_id")
  private OcOptionValueDescriptionId languageId;

  public OcOptionValueDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setOptionValueId( OcOptionValueDescriptionId value) {
      this.optionValueId = value;
    }

    public void setLanguageId( OcOptionValueDescriptionId value) {
      this.languageId = value;
    }

    public OcOptionValueDescriptionId getOptionValueId() {
      return this.optionValueId;
    }

    public OcOptionValueDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return optionValueId.hashCode() 
      + languageId.hashCode();
  }

}