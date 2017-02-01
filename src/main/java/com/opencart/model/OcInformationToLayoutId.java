package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcInformationToLayoutId  implements Serializable  {
  @Column(name="information_id")
  private OcInformationToLayoutId informationId;

  @Column(name="store_id")
  private OcInformationToLayoutId storeId;

  public OcInformationToLayoutId() {
        // Your class must have a no-arq constructor
    }

    public void setInformationId( OcInformationToLayoutId value) {
      this.informationId = value;
    }

    public void setStoreId( OcInformationToLayoutId value) {
      this.storeId = value;
    }

    public OcInformationToLayoutId getInformationId() {
      return this.informationId;
    }

    public OcInformationToLayoutId getStoreId() {
      return this.storeId;
    }

  @Override
  public int hashCode() {
      return informationId.hashCode() 
      + storeId.hashCode();
  }

}