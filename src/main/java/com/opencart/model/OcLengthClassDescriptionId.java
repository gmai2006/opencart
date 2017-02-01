package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcLengthClassDescriptionId  implements Serializable  {
  @Column(name="length_class_id")
  private OcLengthClassDescriptionId lengthClassId;

  @Column(name="language_id")
  private OcLengthClassDescriptionId languageId;

  public OcLengthClassDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLengthClassId( OcLengthClassDescriptionId value) {
      this.lengthClassId = value;
    }

    public void setLanguageId( OcLengthClassDescriptionId value) {
      this.languageId = value;
    }

    public OcLengthClassDescriptionId getLengthClassId() {
      return this.lengthClassId;
    }

    public OcLengthClassDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return lengthClassId.hashCode() 
      + languageId.hashCode();
  }

}