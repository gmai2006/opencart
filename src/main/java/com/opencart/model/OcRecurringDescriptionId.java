package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcRecurringDescriptionId  implements Serializable  {
  @Column(name="recurring_id")
  private OcRecurringDescriptionId recurringId;

  @Column(name="language_id")
  private OcRecurringDescriptionId languageId;

  public OcRecurringDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setRecurringId( OcRecurringDescriptionId value) {
      this.recurringId = value;
    }

    public void setLanguageId( OcRecurringDescriptionId value) {
      this.languageId = value;
    }

    public OcRecurringDescriptionId getRecurringId() {
      return this.recurringId;
    }

    public OcRecurringDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return recurringId.hashCode() 
      + languageId.hashCode();
  }

}