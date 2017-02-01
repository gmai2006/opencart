package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcMenuDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private OcMenuDescriptionId languageId;

  @Column(name="menu_id")
  private OcMenuDescriptionId menuId;

  public OcMenuDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( OcMenuDescriptionId value) {
      this.languageId = value;
    }

    public void setMenuId( OcMenuDescriptionId value) {
      this.menuId = value;
    }

    public OcMenuDescriptionId getLanguageId() {
      return this.languageId;
    }

    public OcMenuDescriptionId getMenuId() {
      return this.menuId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + menuId.hashCode();
  }

}