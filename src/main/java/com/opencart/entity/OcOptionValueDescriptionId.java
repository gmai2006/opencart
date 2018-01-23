
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOptionValueDescriptionId  implements Serializable  {
  @Column(name="option_value_id")
  private Integer option_value_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcOptionValueDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setOptionValueId( Integer value) {
      this.option_value_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getOptionValueId() {
      return this.option_value_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return option_value_id.hashCode()
      + language_id.hashCode();
  }

}