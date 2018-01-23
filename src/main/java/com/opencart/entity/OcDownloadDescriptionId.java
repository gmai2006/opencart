
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcDownloadDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer language_id;

  @Column(name="download_id")
  private Integer download_id;

  public OcDownloadDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public void setDownloadId( Integer value) {
      this.download_id = value;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

    public Integer getDownloadId() {
      return this.download_id;
    }

  @Override
  public int hashCode() {
      return language_id.hashCode()
      + download_id.hashCode();
  }

}