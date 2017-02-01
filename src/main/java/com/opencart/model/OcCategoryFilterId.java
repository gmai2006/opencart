package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryFilterId  implements Serializable  {
  @Column(name="category_id")
  private OcCategoryFilterId categoryId;

  @Column(name="filter_id")
  private OcCategoryFilterId filterId;

  public OcCategoryFilterId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( OcCategoryFilterId value) {
      this.categoryId = value;
    }

    public void setFilterId( OcCategoryFilterId value) {
      this.filterId = value;
    }

    public OcCategoryFilterId getCategoryId() {
      return this.categoryId;
    }

    public OcCategoryFilterId getFilterId() {
      return this.filterId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + filterId.hashCode();
  }

}