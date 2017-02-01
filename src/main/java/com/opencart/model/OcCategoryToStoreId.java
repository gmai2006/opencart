package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryToStoreId  implements Serializable  {
  @Column(name="store_id")
  private OcCategoryToStoreId storeId;

  @Column(name="category_id")
  private OcCategoryToStoreId categoryId;

  public OcCategoryToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( OcCategoryToStoreId value) {
      this.storeId = value;
    }

    public void setCategoryId( OcCategoryToStoreId value) {
      this.categoryId = value;
    }

    public OcCategoryToStoreId getStoreId() {
      return this.storeId;
    }

    public OcCategoryToStoreId getCategoryId() {
      return this.categoryId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + categoryId.hashCode();
  }

}