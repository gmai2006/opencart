package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryDescriptionId  implements Serializable  {
  @Column(name="category_id")
  private OcCategoryDescriptionId categoryId;

  @Column(name="language_id")
  private OcCategoryDescriptionId languageId;

  public OcCategoryDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( OcCategoryDescriptionId value) {
      this.categoryId = value;
    }

    public void setLanguageId( OcCategoryDescriptionId value) {
      this.languageId = value;
    }

    public OcCategoryDescriptionId getCategoryId() {
      return this.categoryId;
    }

    public OcCategoryDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + languageId.hashCode();
  }

}