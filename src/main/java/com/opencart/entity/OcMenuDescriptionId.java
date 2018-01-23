
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcMenuDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer language_id;

  @Column(name="menu_id")
  private Integer menu_id;

  public OcMenuDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public void setMenuId( Integer value) {
      this.menu_id = value;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

    public Integer getMenuId() {
      return this.menu_id;
    }

  @Override
  public int hashCode() {
      return language_id.hashCode()
      + menu_id.hashCode();
  }

}