package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOptionDescriptionId  implements Serializable  {
  @Column(name="option_id")
  private OcOptionDescriptionId optionId;

  @Column(name="language_id")
  private OcOptionDescriptionId languageId;

  public OcOptionDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setOptionId( OcOptionDescriptionId value) {
      this.optionId = value;
    }

    public void setLanguageId( OcOptionDescriptionId value) {
      this.languageId = value;
    }

    public OcOptionDescriptionId getOptionId() {
      return this.optionId;
    }

    public OcOptionDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return optionId.hashCode() 
      + languageId.hashCode();
  }

}