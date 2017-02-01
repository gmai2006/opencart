package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryToLayoutId  implements Serializable  {
  @Column(name="store_id")
  private OcCategoryToLayoutId storeId;

  @Column(name="category_id")
  private OcCategoryToLayoutId categoryId;

  public OcCategoryToLayoutId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( OcCategoryToLayoutId value) {
      this.storeId = value;
    }

    public void setCategoryId( OcCategoryToLayoutId value) {
      this.categoryId = value;
    }

    public OcCategoryToLayoutId getStoreId() {
      return this.storeId;
    }

    public OcCategoryToLayoutId getCategoryId() {
      return this.categoryId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + categoryId.hashCode();
  }

}