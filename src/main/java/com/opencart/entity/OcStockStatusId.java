
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcStockStatusId  implements Serializable  {
  @Column(name="stock_status_id")
  private Integer stock_status_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcStockStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setStockStatusId( Integer value) {
      this.stock_status_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getStockStatusId() {
      return this.stock_status_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return stock_status_id.hashCode()
      + language_id.hashCode();
  }

}