
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcFilterGroupDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer language_id;

  @Column(name="filter_group_id")
  private Integer filter_group_id;

  public OcFilterGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public void setFilterGroupId( Integer value) {
      this.filter_group_id = value;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

    public Integer getFilterGroupId() {
      return this.filter_group_id;
    }

  @Override
  public int hashCode() {
      return language_id.hashCode()
      + filter_group_id.hashCode();
  }

}