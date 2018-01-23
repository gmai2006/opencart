
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryPathId  implements Serializable  {
  @Column(name="category_id")
  private Integer category_id;

  @Column(name="path_id")
  private Integer path_id;

  public OcCategoryPathId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.category_id = value;
    }

    public void setPathId( Integer value) {
      this.path_id = value;
    }

    public Integer getCategoryId() {
      return this.category_id;
    }

    public Integer getPathId() {
      return this.path_id;
    }

  @Override
  public int hashCode() {
      return category_id.hashCode()
      + path_id.hashCode();
  }

}