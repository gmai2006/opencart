package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcFilterGroupDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private OcFilterGroupDescriptionId languageId;

  @Column(name="filter_group_id")
  private OcFilterGroupDescriptionId filterGroupId;

  public OcFilterGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( OcFilterGroupDescriptionId value) {
      this.languageId = value;
    }

    public void setFilterGroupId( OcFilterGroupDescriptionId value) {
      this.filterGroupId = value;
    }

    public OcFilterGroupDescriptionId getLanguageId() {
      return this.languageId;
    }

    public OcFilterGroupDescriptionId getFilterGroupId() {
      return this.filterGroupId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + filterGroupId.hashCode();
  }

}