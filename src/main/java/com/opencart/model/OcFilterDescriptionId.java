package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcFilterDescriptionId  implements Serializable  {
  @Column(name="filter_id")
  private OcFilterDescriptionId filterId;

  @Column(name="language_id")
  private OcFilterDescriptionId languageId;

  public OcFilterDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setFilterId( OcFilterDescriptionId value) {
      this.filterId = value;
    }

    public void setLanguageId( OcFilterDescriptionId value) {
      this.languageId = value;
    }

    public OcFilterDescriptionId getFilterId() {
      return this.filterId;
    }

    public OcFilterDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return filterId.hashCode() 
      + languageId.hashCode();
  }

}