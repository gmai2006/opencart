
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOptionDescriptionId  implements Serializable  {
  @Column(name="option_id")
  private Integer option_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcOptionDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setOptionId( Integer value) {
      this.option_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getOptionId() {
      return this.option_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return option_id.hashCode()
      + language_id.hashCode();
  }

}