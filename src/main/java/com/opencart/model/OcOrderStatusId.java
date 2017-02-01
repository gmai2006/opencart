package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOrderStatusId  implements Serializable  {
  @Column(name="order_status_id")
  private OcOrderStatusId orderStatusId;

  @Column(name="language_id")
  private OcOrderStatusId languageId;

  public OcOrderStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setOrderStatusId( OcOrderStatusId value) {
      this.orderStatusId = value;
    }

    public void setLanguageId( OcOrderStatusId value) {
      this.languageId = value;
    }

    public OcOrderStatusId getOrderStatusId() {
      return this.orderStatusId;
    }

    public OcOrderStatusId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return orderStatusId.hashCode() 
      + languageId.hashCode();
  }

}