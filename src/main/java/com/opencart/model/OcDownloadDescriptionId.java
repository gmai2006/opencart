package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcDownloadDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private OcDownloadDescriptionId languageId;

  @Column(name="download_id")
  private OcDownloadDescriptionId downloadId;

  public OcDownloadDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( OcDownloadDescriptionId value) {
      this.languageId = value;
    }

    public void setDownloadId( OcDownloadDescriptionId value) {
      this.downloadId = value;
    }

    public OcDownloadDescriptionId getLanguageId() {
      return this.languageId;
    }

    public OcDownloadDescriptionId getDownloadId() {
      return this.downloadId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + downloadId.hashCode();
  }

}