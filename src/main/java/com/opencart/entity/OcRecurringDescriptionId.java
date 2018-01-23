
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcRecurringDescriptionId  implements Serializable  {
  @Column(name="recurring_id")
  private Integer recurring_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcRecurringDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setRecurringId( Integer value) {
      this.recurring_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getRecurringId() {
      return this.recurring_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return recurring_id.hashCode()
      + language_id.hashCode();
  }

}