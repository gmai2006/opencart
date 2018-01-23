
package com.opencart.entity;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcVoucherThemeDescriptionId  implements Serializable  {
  @Column(name="voucher_theme_id")
  private Integer voucher_theme_id;

  @Column(name="language_id")
  private Integer language_id;

  public OcVoucherThemeDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setVoucherThemeId( Integer value) {
      this.voucher_theme_id = value;
    }

    public void setLanguageId( Integer value) {
      this.language_id = value;
    }

    public Integer getVoucherThemeId() {
      return this.voucher_theme_id;
    }

    public Integer getLanguageId() {
      return this.language_id;
    }

  @Override
  public int hashCode() {
      return voucher_theme_id.hashCode()
      + language_id.hashCode();
  }

}