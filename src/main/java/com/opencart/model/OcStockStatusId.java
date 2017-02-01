package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcStockStatusId  implements Serializable  {
  @Column(name="stock_status_id")
  private OcStockStatusId stockStatusId;

  @Column(name="language_id")
  private OcStockStatusId languageId;

  public OcStockStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setStockStatusId( OcStockStatusId value) {
      this.stockStatusId = value;
    }

    public void setLanguageId( OcStockStatusId value) {
      this.languageId = value;
    }

    public OcStockStatusId getStockStatusId() {
      return this.stockStatusId;
    }

    public OcStockStatusId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return stockStatusId.hashCode() 
      + languageId.hashCode();
  }

}