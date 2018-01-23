
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryToStoreId  implements Serializable  {
  @Column(name="store_id")
  private Integer store_id;

  @Column(name="category_id")
  private Integer category_id;

  public OcCategoryToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( Integer value) {
      this.store_id = value;
    }

    public void setCategoryId( Integer value) {
      this.category_id = value;
    }

    public Integer getStoreId() {
      return this.store_id;
    }

    public Integer getCategoryId() {
      return this.category_id;
    }

  @Override
  public int hashCode() {
      return store_id.hashCode()
      + category_id.hashCode();
  }

}