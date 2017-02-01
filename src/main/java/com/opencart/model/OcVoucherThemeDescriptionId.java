package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcVoucherThemeDescriptionId  implements Serializable  {
  @Column(name="voucher_theme_id")
  private OcVoucherThemeDescriptionId voucherThemeId;

  @Column(name="language_id")
  private OcVoucherThemeDescriptionId languageId;

  public OcVoucherThemeDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setVoucherThemeId( OcVoucherThemeDescriptionId value) {
      this.voucherThemeId = value;
    }

    public void setLanguageId( OcVoucherThemeDescriptionId value) {
      this.languageId = value;
    }

    public OcVoucherThemeDescriptionId getVoucherThemeId() {
      return this.voucherThemeId;
    }

    public OcVoucherThemeDescriptionId getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return voucherThemeId.hashCode() 
      + languageId.hashCode();
  }

}