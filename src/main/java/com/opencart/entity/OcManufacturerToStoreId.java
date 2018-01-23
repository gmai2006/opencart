
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcManufacturerToStoreId  implements Serializable  {
  @Column(name="store_id")
  private Integer store_id;

  @Column(name="manufacturer_id")
  private Integer manufacturer_id;

  public OcManufacturerToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( Integer value) {
      this.store_id = value;
    }

    public void setManufacturerId( Integer value) {
      this.manufacturer_id = value;
    }

    public Integer getStoreId() {
      return this.store_id;
    }

    public Integer getManufacturerId() {
      return this.manufacturer_id;
    }

  @Override
  public int hashCode() {
      return store_id.hashCode()
      + manufacturer_id.hashCode();
  }

}