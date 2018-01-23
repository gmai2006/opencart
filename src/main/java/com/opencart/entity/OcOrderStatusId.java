
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOrderStatusId  implements Serializable  {
  @Column(name="order_status_id")
  private Integer order_status_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcOrderStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setOrderStatusId( Integer value) {
      this.order_status_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getOrderStatusId() {
      return this.order_status_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return order_status_id.hashCode()
      + language_id.hashCode();
  }

}