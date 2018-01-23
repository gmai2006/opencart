
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcInformationToLayoutId  implements Serializable  {
  @Column(name="information_id")
  private Integer information_id;

  @Column(name="store_id")
  private Integer store_id;

  public OcInformationToLayoutId() {
        // Your class must have a no-arq constructor
    }

    public void setInformationId( Integer value) {
      this.information_id = value;
    }

    public void setStoreId( Integer value) {
      this.store_id = value;
    }

    public Integer getInformationId() {
      return this.information_id;
    }

    public Integer getStoreId() {
      return this.store_id;
    }

  @Override
  public int hashCode() {
      return information_id.hashCode()
      + store_id.hashCode();
  }

}