
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnStatusId  implements Serializable  {
  @Column(name="return_status_id")
  private Integer return_status_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcReturnStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setReturnStatusId( Integer value) {
      this.return_status_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getReturnStatusId() {
      return this.return_status_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return return_status_id.hashCode()
      + language_id.hashCode();
  }

}