
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryFilterId  implements Serializable  {
  @Column(name="category_id")
  private Integer category_id;

  @Column(name="filter_id")
  private Integer filter_id;

  public OcCategoryFilterId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.category_id = value;
    }

    public void setFilterId( Integer value) {
      this.filter_id = value;
    }

    public Integer getCategoryId() {
      return this.category_id;
    }

    public Integer getFilterId() {
      return this.filter_id;
    }

  @Override
  public int hashCode() {
      return category_id.hashCode()
      + filter_id.hashCode();
  }

}