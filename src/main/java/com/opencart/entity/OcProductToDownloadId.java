
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToDownloadId  implements Serializable  {
  @Column(name="product_id")
  private Integer product_id;

  @Column(name="download_id")
  private Integer download_id;

  public OcProductToDownloadId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( Integer value) {
      this.product_id = value;
    }

    public void setDownloadId( Integer value) {
      this.download_id = value;
    }

    public Integer getProductId() {
      return this.product_id;
    }

    public Integer getDownloadId() {
      return this.download_id;
    }

  @Override
  public int hashCode() {
      return product_id.hashCode()
      + download_id.hashCode();
  }

}