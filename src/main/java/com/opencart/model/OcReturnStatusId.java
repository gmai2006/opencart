package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnStatusId  implements Serializable  {
  @Column(name="return_status_id")
  private OcReturnStatusId returnStatusId;

  @Column(name="language_id")
  private OcReturnStatusId languageId;

  public OcReturnStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setReturnStatusId( OcReturnStatusId value) {
      this.returnStatusId = value;
    }

    public void setLanguageId( OcReturnStatusId value) {
      this.languageId = value;
    }

    public OcReturnStatusId getReturnStatusId() {
      return this.returnStatusId;
    }

    public OcReturnStatusId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return returnStatusId.hashCode() 
      + languageId.hashCode();
  }

}