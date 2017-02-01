package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToDownloadId  implements Serializable  {
  @Column(name="product_id")
  private OcProductToDownloadId productId;

  @Column(name="download_id")
  private OcProductToDownloadId downloadId;

  public OcProductToDownloadId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( OcProductToDownloadId value) {
      this.productId = value;
    }

    public void setDownloadId( OcProductToDownloadId value) {
      this.downloadId = value;
    }

    public OcProductToDownloadId getProductId() {
      return this.productId;
    }

    public OcProductToDownloadId getDownloadId() {
      return this.downloadId;
    }

  @Override
  public int hashCode() {
      return productId.hashCode() 
      + downloadId.hashCode();
  }

}