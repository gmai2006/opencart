package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryPathId  implements Serializable  {
  @Column(name="category_id")
  private OcCategoryPathId categoryId;

  @Column(name="path_id")
  private OcCategoryPathId pathId;

  public OcCategoryPathId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( OcCategoryPathId value) {
      this.categoryId = value;
    }

    public void setPathId( OcCategoryPathId value) {
      this.pathId = value;
    }

    public OcCategoryPathId getCategoryId() {
      return this.categoryId;
    }

    public OcCategoryPathId getPathId() {
      return this.pathId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + pathId.hashCode();
  }

}