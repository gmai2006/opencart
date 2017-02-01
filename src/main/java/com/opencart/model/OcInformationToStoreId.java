package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcInformationToStoreId  implements Serializable  {
  @Column(name="information_id")
  private OcInformationToStoreId informationId;

  @Column(name="store_id")
  private OcInformationToStoreId storeId;

  public OcInformationToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setInformationId( OcInformationToStoreId value) {
      this.informationId = value;
    }

    public void setStoreId( OcInformationToStoreId value) {
      this.storeId = value;
    }

    public OcInformationToStoreId getInformationId() {
      return this.informationId;
    }

    public OcInformationToStoreId getStoreId() {
      return this.storeId;
    }

  @Override
  public int hashCode() {
      return informationId.hashCode() 
      + storeId.hashCode();
  }

}