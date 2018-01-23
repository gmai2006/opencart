
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnReasonId  implements Serializable  {
  @Column(name="return_reason_id")
  private Integer return_reason_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcReturnReasonId() {
        // Your class must have a no-arq constructor
    }

    public void setReturnReasonId( Integer value) {
      this.return_reason_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getReturnReasonId() {
      return this.return_reason_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return return_reason_id.hashCode()
      + language_id.hashCode();
  }

}