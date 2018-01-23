
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcFilterDescriptionId  implements Serializable  {
  @Column(name="filter_id")
  private Integer filter_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcFilterDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setFilterId( Integer value) {
      this.filter_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getFilterId() {
      return this.filter_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return filter_id.hashCode()
      + language_id.hashCode();
  }

}