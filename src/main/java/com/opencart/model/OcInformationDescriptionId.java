package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcInformationDescriptionId  implements Serializable  {
  @Column(name="information_id")
  private OcInformationDescriptionId informationId;

  @Column(name="language_id")
  private OcInformationDescriptionId languageId;

  public OcInformationDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setInformationId( OcInformationDescriptionId value) {
      this.informationId = value;
    }

    public void setLanguageId( OcInformationDescriptionId value) {
      this.languageId = value;
    }

    public OcInformationDescriptionId getInformationId() {
      return this.informationId;
    }

    public OcInformationDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return informationId.hashCode() 
      + languageId.hashCode();
  }

}