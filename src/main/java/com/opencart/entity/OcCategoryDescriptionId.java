
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryDescriptionId  implements Serializable  {
  @Column(name="category_id")
  private Integer category_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcCategoryDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.category_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getCategoryId() {
      return this.category_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return category_id.hashCode()
      + language_id.hashCode();
  }

}