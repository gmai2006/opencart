package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcManufacturerToStoreId  implements Serializable  {
  @Column(name="store_id")
  private OcManufacturerToStoreId storeId;

  @Column(name="manufacturer_id")
  private OcManufacturerToStoreId manufacturerId;

  public OcManufacturerToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( OcManufacturerToStoreId value) {
      this.storeId = value;
    }

    public void setManufacturerId( OcManufacturerToStoreId value) {
      this.manufacturerId = value;
    }

    public OcManufacturerToStoreId getStoreId() {
      return this.storeId;
    }

    public OcManufacturerToStoreId getManufacturerId() {
      return this.manufacturerId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + manufacturerId.hashCode();
  }

}