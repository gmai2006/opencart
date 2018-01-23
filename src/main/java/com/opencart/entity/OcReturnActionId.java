
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnActionId  implements Serializable  {
  @Column(name="language_id")
  private Integer language_id;

  @Column(name="return_action_id")
  private Integer return_action_id;

  public OcReturnActionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public void setReturnActionId( Integer value) {
      this.return_action_id = value;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

    public Integer getReturnActionId() {
      return this.return_action_id;
    }

  @Override
  public int hashCode() {
      return language_id.hashCode()
      + return_action_id.hashCode();
  }

}