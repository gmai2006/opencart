package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnReasonId  implements Serializable  {
  @Column(name="return_reason_id")
  private OcReturnReasonId returnReasonId;

  @Column(name="language_id")
  private OcReturnReasonId languageId;

  public OcReturnReasonId() {
        // Your class must have a no-arq constructor
    }

    public void setReturnReasonId( OcReturnReasonId value) {
      this.returnReasonId = value;
    }

    public void setLanguageId( OcReturnReasonId value) {
      this.languageId = value;
    }

    public OcReturnReasonId getReturnReasonId() {
      return this.returnReasonId;
    }

    public OcReturnReasonId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return returnReasonId.hashCode() 
      + languageId.hashCode();
  }

}