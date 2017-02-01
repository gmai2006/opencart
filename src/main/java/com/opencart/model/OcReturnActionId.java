package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnActionId  implements Serializable  {
  @Column(name="language_id")
  private OcReturnActionId languageId;

  @Column(name="return_action_id")
  private OcReturnActionId returnActionId;

  public OcReturnActionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( OcReturnActionId value) {
      this.languageId = value;
    }

    public void setReturnActionId( OcReturnActionId value) {
      this.returnActionId = value;
    }

    public OcReturnActionId getLanguageId() {
      return this.languageId;
    }

    public OcReturnActionId getReturnActionId() {
      return this.returnActionId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + returnActionId.hashCode();
  }

}