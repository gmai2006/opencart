package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcWeightClassDescriptionId  implements Serializable  {
  @Column(name="weight_class_id")
  private OcWeightClassDescriptionId weightClassId;

  @Column(name="language_id")
  private OcWeightClassDescriptionId languageId;

  public OcWeightClassDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setWeightClassId( OcWeightClassDescriptionId value) {
      this.weightClassId = value;
    }

    public void setLanguageId( OcWeightClassDescriptionId value) {
      this.languageId = value;
    }

    public OcWeightClassDescriptionId getWeightClassId() {
      return this.weightClassId;
    }

    public OcWeightClassDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return weightClassId.hashCode() 
      + languageId.hashCode();
  }

}